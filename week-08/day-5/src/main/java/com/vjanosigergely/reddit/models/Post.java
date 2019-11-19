package com.vjanosigergely.reddit.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String link;
  private int votes;
  @Temporal(TemporalType.TIMESTAMP)
  private Date date;
  @ManyToOne
  private User postOwner;

  public Post(){
    this.date = new Date();
  }

  public Post(String title, String link, User user){
    this.title = title;
    this.link = link;
    this.postOwner = user;
    this.date = new Date();
  }


}
