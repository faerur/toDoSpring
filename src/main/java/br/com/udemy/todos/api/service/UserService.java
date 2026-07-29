package br.com.udemy.todos.api.service;

import java.util.List;

import br.com.udemy.todos.api.model.entity.User;
import br.com.udemy.todos.api.response.UserResponse;

public interface UserService {

  User getUser(Long id);

  List<UserResponse> getUserInfo();
}
