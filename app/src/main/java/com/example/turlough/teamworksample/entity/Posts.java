
package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Posts {

    @SerializedName("post")
    @Expose
    private Post post;

    /**
     * 
     * @return
     *     The post
     */
    public Post getPost() {
        return post;
    }

    /**
     * 
     * @param post
     *     The post
     */
    public void setPost(Post post) {
        this.post = post;
    }

}
