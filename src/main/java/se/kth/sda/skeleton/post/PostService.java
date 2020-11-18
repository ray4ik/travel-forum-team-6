package se.kth.sda.skeleton.post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.kth.sda.skeleton.comment.Comment;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public List<Post> getAll(){
        return postRepo.findAll();
    }

    public Optional<Post> getById(Long id){
        return postRepo.findById(id);
    }

    public Post create(Post newPost) {

        return postRepo.save(newPost);

    }

    public Post update(Post updatedPost) {

        return postRepo.save(updatedPost);

    }

    public void delete(Long id) {
        postRepo.deleteById(id);

    }

   /* public List<Post> getAllByPostId(Long postId) {
        return postRepo.findAllByPosts_Id(postId);

    }*/
}
