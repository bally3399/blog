package africa.semicolon.blog.services;

import africa.semicolon.blog.data.model.Post;
import africa.semicolon.blog.data.repositories.PostRepositories;
import africa.semicolon.blog.dtos.request.CreatePostRequest;
import org.springframework.web.servlet.View;

import java.util.List;

public class PostServicesImpl implements PostServices{
    private PostRepositories postRepositories;

    @Override
    public void createPost(CreatePostRequest createPostRequest) {

    }

    @Override
    public void editPost(String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void view(View view) {

    }

    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public void findById(String id) {

    }

    @Override
    public List<Post> getNumberOfPost() {
        return postRepositories.findAll();
    }
}
