package com.vjanosigergely.reddit.services;

import com.vjanosigergely.reddit.models.User;
import com.vjanosigergely.reddit.repos.UserRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

  @Autowired
  UserRepo userRepo;

  @Override
  public List<User> findAll() {
    List <User> allUsers = new ArrayList<>();
    userRepo.findAll().forEach(user -> allUsers.add(user));
    return allUsers;
  }

  @Override
  public void save(User user) {
  userRepo.save(user);
  }

  @Override
  public void delete(Long id) {
  userRepo.deleteById(id);
  }

  @Override
  public User findById(Long id) {
    return userRepo.findById(id).orElse(null);
  }

  @Override
  public User findByUsername(String username) {
    User searched = userRepo.findByUsername(username);
    return searched;
  }
}
