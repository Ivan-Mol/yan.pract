package Sprint3.Post;

import java.util.Arrays;

public class PostComment {
    private String text; // содержание комментария

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "text='" + text + '\'' +
                ", whoLiked=" + Arrays.toString(whoLiked) +
                '}';
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    private String[] whoLiked; // кто поддержал
}