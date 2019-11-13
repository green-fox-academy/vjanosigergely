package com.vjanosigergely.frontend.services;

import com.vjanosigergely.frontend.Models.Log;
import com.vjanosigergely.frontend.repos.LogRepoInterface;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService implements IntLogService {

  @Autowired
  LogRepoInterface logRepoInterface;

  LogService(LogRepoInterface logRepoInterface){
    this.logRepoInterface = logRepoInterface;
  }

  @Override
  public Log findbyId(Long id) {
    return logRepoInterface.findById(id).orElse(null);
  }

  @Override
  public void save(Log log) {
    logRepoInterface.save(log);
  }

  @Override
  public void delete(Long id) {
    logRepoInterface.deleteById(id);
  }

  @Override
  public List<Log> findAll() {
    List<Log> allLogs = new ArrayList<>();
    logRepoInterface.findAll().forEach(l ->allLogs.add(l));
    return allLogs;
  }
}
