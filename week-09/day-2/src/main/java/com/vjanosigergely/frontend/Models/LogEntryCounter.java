package com.vjanosigergely.frontend.Models;

import java.util.List;

public class LogEntryCounter {
  List<Log> entries;
  int entry_count;

  public LogEntryCounter() {
  }

  public LogEntryCounter(List<Log> entries, int entry_count) {
    this.entries = entries;
    this.entry_count = entry_count;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }
}
