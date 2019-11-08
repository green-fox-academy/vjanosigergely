package com.vjanosigergely.reddit.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
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

  public Post(){
    this.date = new Date();
  }

  public Post(String title, String link){
    this.title = title;
    this.link = link;
    this.date = new Date();
  }


}
