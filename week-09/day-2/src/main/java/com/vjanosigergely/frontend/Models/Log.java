package com.vjanosigergely.frontend.Models;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Log {
  Date createdAt;
  String endpoint;
  String data;


}


//Create a log object which has the following fields:
//createdAt - date and time
//endpoint - string
//data - string