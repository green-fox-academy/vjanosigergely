package com.vjanosigergely.reddit.repos;

import com.vjanosigergely.reddit.models.Post;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post,Long>{
List<Post> findById(long id);
}
