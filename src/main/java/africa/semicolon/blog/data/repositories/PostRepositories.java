package africa.semicolon.blog.data.repositories;

import africa.semicolon.blog.data.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepositories extends MongoRepository<Post, String> {

}
