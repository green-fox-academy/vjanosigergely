package com.vjanosigergely.frontend.services;

import com.vjanosigergely.frontend.Models.Log;
import java.util.List;

public interface IntLogService {
  Log findbyId(Long id);
  void save(Log log);
  void delete(Long id);
  List<Log> findAll();

}
