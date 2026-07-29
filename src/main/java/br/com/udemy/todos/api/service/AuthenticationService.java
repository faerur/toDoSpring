package br.com.udemy.todos.api.service;

import br.com.udemy.todos.api.request.AuthenticationRequest;
import br.com.udemy.todos.api.request.RegisterRequest;
import br.com.udemy.todos.api.response.AuthenticationResponse;

public interface AuthenticationService {
  void register(RegisterRequest input) throws Exception;

  AuthenticationResponse login(AuthenticationRequest request);

}