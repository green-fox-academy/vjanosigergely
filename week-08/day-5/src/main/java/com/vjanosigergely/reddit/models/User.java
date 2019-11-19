package com.vjanosigergely.reddit.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private long id;
  private String username;
  private String password;
  @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
  private List<Post> postList;

  public User() {
    postList = new ArrayList<>();
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
    postList = new ArrayList<>();
  }

  public void addPost(Post post){
    post.setPostOwner(this);
    postList.add(post);
  }
}


//Add users
//When entering the site ask a username and create the posts for the users
//User model will be needed
//Post model will be updated
//You'll need to somehow tell who is the current user