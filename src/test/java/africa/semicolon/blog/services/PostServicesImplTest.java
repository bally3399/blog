package africa.semicolon.blog.services;

import africa.semicolon.blog.dtos.request.CreatePostRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PostServicesImplTest {
    private PostServices postServices = new PostServicesImpl();
    @Test
    public void createPost(){
        CreatePostRequest postRequest = new CreatePostRequest();
        postRequest.setTitle("title");
        postRequest.setContent("content");
        postServices.createPost(postRequest);
        assertEquals(1, postServices.getNumberOfPost());
    }

}