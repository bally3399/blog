package africa.semicolon.blog.data.repositories;

import africa.semicolon.blog.data.model.View;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ViewRepositories extends MongoRepository<View, String> {

}
