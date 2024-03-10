package kz.dar.university.postcoreapi.controller;

import jakarta.validation.Valid;
import kz.dar.university.postcoreapi.domain.PostModel;
import kz.dar.university.postcoreapi.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private PostService postService;
    @GetMapping("/all")
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("/{id}")
    public PostModel getPostById(@PathVariable String id) {
        return postService.getPostById(id);
    }
    @PostMapping
    public void createPost(@Valid @RequestBody PostModel post) {
        post.setPostId(UUID.randomUUID().toString());
        postService.createPost(post);
    }

    @PutMapping("/{id}")
    public void updatePost(
            @PathVariable String postId,
            @Valid @RequestBody PostModel post) {
        post.setPostId(postId);
        postService.updatePost(post);
    }
    @PutMapping
    public void updatePost(
            @Valid @RequestBody PostModel post) {
        postService.updatePost(post);
    }

    @DeleteMapping
    public void deletePostById(@PathVariable String postId) {
        postService.deletePostById(postId);
    }
}
