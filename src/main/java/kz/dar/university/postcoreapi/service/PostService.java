package kz.dar.university.postcoreapi.service;

import kz.dar.university.postcoreapi.domain.PostModel;

import java.util.List;

public interface PostService {
    List<PostModel> getAllPosts();
    PostModel getPostById(String id);
    void createPost(PostModel post);
    void updatePost(PostModel post);
    void deletePostById(String id);
}
