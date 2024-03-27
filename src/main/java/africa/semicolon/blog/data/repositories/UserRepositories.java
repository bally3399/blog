package africa.semicolon.blog.data.repositories;

import africa.semicolon.blog.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositories extends MongoRepository<User, String> {

}
