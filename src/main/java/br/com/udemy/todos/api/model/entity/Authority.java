package br.com.udemy.todos.api.model.entity;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Authority implements GrantedAuthority {

  private String authority;

  @Override
  public @Nullable String getAuthority() {
    return authority;
  }
}
