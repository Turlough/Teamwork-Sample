
package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Post {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("category-id")
    @Expose
    private String categoryId;
    @SerializedName("notify")
    @Expose
    private List<String> notify = new ArrayList<String>();
    @SerializedName("private")
    @Expose
    private String _private;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("attachments")
    @Expose
    private String attachments;
    @SerializedName("pendingFileAttachments")
    @Expose
    private String pendingFileAttachments;
    @SerializedName("tags")
    @Expose
    private String tags;

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 
     * @param categoryId
     *     The category-id
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 
     * @return
     *     The notify
     */
    public List<String> getNotify() {
        return notify;
    }

    /**
     * 
     * @param notify
     *     The notify
     */
    public void setNotify(List<String> notify) {
        this.notify = notify;
    }

    /**
     * 
     * @return
     *     The _private
     */
    public String getPrivate() {
        return _private;
    }

    /**
     * 
     * @param _private
     *     The private
     */
    public void setPrivate(String _private) {
        this._private = _private;
    }

    /**
     * 
     * @return
     *     The body
     */
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 
     * @return
     *     The attachments
     */
    public String getAttachments() {
        return attachments;
    }

    /**
     * 
     * @param attachments
     *     The attachments
     */
    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    /**
     * 
     * @return
     *     The pendingFileAttachments
     */
    public String getPendingFileAttachments() {
        return pendingFileAttachments;
    }

    /**
     * 
     * @param pendingFileAttachments
     *     The pendingFileAttachments
     */
    public void setPendingFileAttachments(String pendingFileAttachments) {
        this.pendingFileAttachments = pendingFileAttachments;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

}
