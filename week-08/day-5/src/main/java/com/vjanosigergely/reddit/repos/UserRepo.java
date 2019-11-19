package com.vjanosigergely.reddit.repos;

import com.vjanosigergely.reddit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {
User findByUsername(String username);

}
