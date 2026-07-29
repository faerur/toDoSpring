package br.com.udemy.todos.api.response;

import java.util.List;

import br.com.udemy.todos.api.model.entity.Authority;
import br.com.udemy.todos.api.model.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
  private Long id;
  private String fullName;
  private String email;
  private List<Authority> authorities;

  public UserResponse(User user) {
    this.email = user.getEmail();
    this.fullName = user.getFirstName() + " " + user.getLastName();
    this.id = user.getId();
    this.authorities = (List<Authority>) user.getAuthorities();
  }

}
