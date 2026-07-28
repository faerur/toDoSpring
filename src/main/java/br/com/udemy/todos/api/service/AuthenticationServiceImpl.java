// package br.com.udemy.todos.api.service;

// import org.springframework.stereotype.Service;

// import br.com.udemy.todos.api.model.entity.User;
// import jakarta.transaction.Transactional;
// import lombok.AllArgsConstructor;

// @Service
// @AllArgsConstructor
// public class AuthenticationServiceImpl implements AuthenticationService {

// private final JwtService jwtService;

// @Override
// @Transactional
// public void register(RegisterRequest input) throws Exception {
// if (isEmailTaken(input.getEmail())) {
// throw new Exception("Email already taken");
// }
// User user = buildNewUser(input);
// userRepository.save(user);
// }

// @Override
// @Transactional(readOnly = true)
// public AuthenticationResponse login(AuthenticationRequest request) {

// authenticationManager.authenticate(
// new UsernamePasswordAuthenticationToken(request.getEmail(),
// request.getPassword()));

// User user = userRepository.findByEmail(request.getEmail())
// .orElseThrow(() -> new IllegalArgumentException("Invalid email or
// password"));

// String jwtToken = jwtService.generateToken(new HashMap<>(), user);

// return new AuthenticationResponse(jwtToken);
// }

// private boolean isEmailTaken(String email) {
// return userRepository.findByEmail(email).isPresent();
// }

// private User buildNewUser(RegisterRequest input) {
// User user = new User();
// user.setId(0);
// user.setFirstName(input.getFirstName());
// user.setLastName(input.getLastName());
// user.setEmail(input.getEmail());
// user.setPassword(passwordEncoder.encode(input.getPassword()));
// user.setAuthorities(initialAuthority());
// return user;
// }

// private List<Authority> initialAuthority() {
// boolean isFirstUser = userRepository.count() == 0;
// List<Authority> authorities = new ArrayList<>();
// authorities.add(new Authority("ROLE_EMPLOYEE"));
// if (isFirstUser) {
// authorities.add(new Authority("ROLE_ADMIN"));
// }
// return authorities;
// }

// }