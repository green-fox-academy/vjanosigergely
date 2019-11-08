package com.vjanosigergely.reddit.services;

import com.vjanosigergely.reddit.models.Post;
import com.vjanosigergely.reddit.repos.PostRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService implements InterfacePostService {

  @Autowired
  PostRepo postRepo;

  @Override
  public List<Post> findAll() {
    List<Post> posts = new ArrayList<>();
    postRepo.findAll().forEach(post -> posts.add(post));
    return posts;
  }

  @Override
  public void save(Post post) {
  postRepo.save(post);
  }

  @Override
  public void delete(Long id) {
  postRepo.deleteById(id);
  }

  @Override
  public Post findById(Long id) {
    return postRepo.findById(id).orElse(null);
  }

  @Override
  public void increaseById(Long id){
    Post selected = this.findById(id);
    selected.setVotes(selected.getVotes() + 1);
    this.save(selected);
  }

  @Override
  public void decreseById(Long id) {
    Post selected = this.findById(id);
    selected.setVotes(selected.getVotes() - 1);
    this.save(selected);
  }

}
