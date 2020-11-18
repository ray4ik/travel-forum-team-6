package se.kth.sda.skeleton.post;

import se.kth.sda.skeleton.user.User;

import javax.persistence.*;

@Entity
@Table (name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(Long id, String title, String body, User user) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
