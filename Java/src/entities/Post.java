package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comments> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void addComment(Comments comments) {
        this.comments.add(comments);
    }

    public void removeComment(Comments comments) {
        this.comments.remove(comments);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(title).append("\n");
        sb.append(likes).append(" - Likes \n");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments: \n");
        for (Comments c: comments) {
            sb.append(c.getText()).append("\n");
        }

        return sb.toString();
    }
}
