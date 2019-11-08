package com.vjanosigergely.reddit.repos;

import com.vjanosigergely.reddit.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post,Long>{
List<Post> findById(long id);
@Query(value = "select * from post order by votes desc Limit 0, 10",nativeQuery = true)
List<Post> findAllOrderByVotes();
}
