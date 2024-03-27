package africa.semicolon.blog.data.repositories;

import africa.semicolon.blog.data.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepositories extends MongoRepository<Comment, String> {

}
