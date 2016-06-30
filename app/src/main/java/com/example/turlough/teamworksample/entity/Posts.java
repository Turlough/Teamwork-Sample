
package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Posts {

    @SerializedName("post")
    @Expose
    private Post post;

    public Posts(Post post) {

        this.post = post;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

}
