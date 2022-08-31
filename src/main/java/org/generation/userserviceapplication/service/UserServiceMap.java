package org.generation.userserviceapplication.service;

import org.generation.userserviceapplication.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceMap
    implements UserService {
  final Map<Integer, User> userMap = new HashMap<>();

  @Override
  public List<User> getAll() {
    Collection<User> set = userMap.values();
    List<User> list = new ArrayList<User>(set);
    return list;
  }

  @Override
  public void add(User user) {
    userMap.put(userMap.size(), user);
  }

  @Override
  public void remove(User user) {
    userMap.remove(user.getId());
  }

  @Override
  public int size() {
    return userMap.size();
  }

  @Override
  public User getUser(int position) {
    // Collection<User> set = userMap.values();
    // User output = null;
    // for (int i = 0; i <= position; i++) {
    //   output = set.iterator().next();
    // }
    // return output;
    return userMap.get(position);
  }
}
