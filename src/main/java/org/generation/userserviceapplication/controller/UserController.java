package org.generation.userserviceapplication.controller;

import java.util.List;

import org.generation.userserviceapplication.model.User;
import org.generation.userserviceapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  final UserService userService;

  public UserController(@Autowired UserService userService) {
    this.userService = userService;
    userService.add(new User(1, "Santiago", "Carrillo"));
  }

  @GetMapping("/user")
  public User getUser() {
    return userService.getUser(0);
  }

}
