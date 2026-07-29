package br.com.udemy.todos.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.udemy.todos.api.response.UserResponse;
import br.com.udemy.todos.api.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
@Tag(name = "User REST API Endpoints", description = "Operations related to info about current users")
public class UserController {

  private UserService userService;

  @GetMapping("/info")
  public List<UserResponse> getUserInfo() {
    return userService.getUserInfo();
  }
}
