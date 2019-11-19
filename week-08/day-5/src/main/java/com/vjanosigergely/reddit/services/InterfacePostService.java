package com.vjanosigergely.reddit.services;

import com.vjanosigergely.reddit.models.Post;
import java.util.List;


public interface InterfacePostService {

  List<Post> findAll();

  void save(Post post);

  void delete(Long id);

  Post findById(Long id);

  void increaseById(Long id);

  void decreseById(Long id);

  List<Post> findAllOrderByVotes(Integer page);
}
