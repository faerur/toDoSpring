package br.com.udemy.todos.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.udemy.todos.api.model.entity.User;
import br.com.udemy.todos.api.repository.UserRepository;
import br.com.udemy.todos.api.response.UserResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public User getUser(Long id) {
    return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
  }

  @Override
  public List<UserResponse> getUserInfo() {
    return userRepository.findAll().stream().map(UserResponse::new).collect(Collectors.toList());

  }

}
