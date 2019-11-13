package com.vjanosigergely.frontend.repos;

import com.vjanosigergely.frontend.Models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepoInterface extends CrudRepository<Log,Long> {

}
