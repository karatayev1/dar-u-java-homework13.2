package kz.dar.university.postcoreapi.service;

import kz.dar.university.postcoreapi.domain.PostModel;

import java.util.HashMap;
import java.util.List;

public class PostServiceImpl implements PostService {

    private HashMap<String, PostModel> posts = new HashMap<>();

    {
        posts.put(
                "66666",
                PostModel
                        .builder()
                        .postId("66666")
                        .clientId("900645341857")
                        .postRecipientId("860645341857")
                        .postItem("Book")
                        .status("Create")
                        .build()
        );
    }

    @Override
    public List<PostModel> getAllPosts() {
        return posts
                .values()
                .stream()
                .toList();
    }

    @Override
    public PostModel getPostById(String id) {
        return posts.get(id);
    }

    @Override
    public void createPost(PostModel post) {
        posts.put(post.getPostId(), post);
    }

    @Override
    public void updatePost(PostModel post) {
        String postId = post.getPostId();

        if (posts.containsKey(postId)) {
            posts.put(postId, post);
        }
    }

    @Override
    public void deletePostById(String id) {
        posts.remove(id);
    }
}
