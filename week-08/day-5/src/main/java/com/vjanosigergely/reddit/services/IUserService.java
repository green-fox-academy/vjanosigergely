package com.vjanosigergely.reddit.services;

import com.vjanosigergely.reddit.models.Post;
import com.vjanosigergely.reddit.models.User;
import java.util.List;

public interface IUserService {
  List<User> findAll();

  void save(User user);

  void delete(Long id);

  User findById(Long id);

  User findByUsername(String username);
}
