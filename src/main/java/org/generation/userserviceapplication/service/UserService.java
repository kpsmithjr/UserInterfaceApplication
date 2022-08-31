package org.generation.userserviceapplication.service;

import org.generation.userserviceapplication.model.User;

import java.util.List;

public interface UserService {
  List<User> getAll();

  void add(User user);

  void remove(User user);

  int size();

  User getUser(int position);

}
