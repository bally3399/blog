package africa.semicolon.blog.services;

import africa.semicolon.blog.data.model.Post;
import africa.semicolon.blog.dtos.request.CreatePostRequest;
import org.springframework.web.servlet.View;

import java.util.List;

public interface PostServices {
    void createPost(CreatePostRequest createPostRequest);
    void editPost(String id);
    void delete(String id);
    void view(View view);
    List<Post> findAll();
    void findById(String id);

    List<Post> getNumberOfPost();
}
