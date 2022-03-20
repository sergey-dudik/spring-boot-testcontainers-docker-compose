package com.example.sprintboottestcontainers.controllers;

import com.example.sprintboottestcontainers.models.User;
import com.example.sprintboottestcontainers.services.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping
  public List<User> getAll() {
    return this.userService.findAll();
  }

}
