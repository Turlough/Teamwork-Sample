
package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Generated from http://www.jsonschema2pojo.org/
 */
public class Tasklist {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pinned")
    @Expose
    private Boolean pinned;
    @SerializedName("milestone-id")
    @Expose
    private String milestoneId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("uncompleted-count")
    @Expose
    private Integer uncompletedCount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("complete")
    @Expose
    private Boolean complete;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("projectId")
    @Expose
    private String projectId;
    @SerializedName("projectName")
    @Expose
    private String projectName;
    @SerializedName("DLM")
    @Expose
    private Object dLM;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The pinned
     */
    public Boolean getPinned() {
        return pinned;
    }

    /**
     * 
     * @param pinned
     *     The pinned
     */
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    /**
     * 
     * @return
     *     The milestoneId
     */
    public String getMilestoneId() {
        return milestoneId;
    }

    /**
     * 
     * @param milestoneId
     *     The milestone-id
     */
    public void setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The uncompletedCount
     */
    public Integer getUncompletedCount() {
        return uncompletedCount;
    }

    /**
     * 
     * @param uncompletedCount
     *     The uncompleted-count
     */
    public void setUncompletedCount(Integer uncompletedCount) {
        this.uncompletedCount = uncompletedCount;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The complete
     */
    public Boolean getComplete() {
        return complete;
    }

    /**
     * 
     * @param complete
     *     The complete
     */
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    /**
     * 
     * @return
     *     The _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * 
     * @param _private
     *     The private
     */
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     * 
     * @return
     *     The position
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The projectId
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 
     * @param projectId
     *     The projectId
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * 
     * @return
     *     The projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 
     * @param projectName
     *     The projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 
     * @return
     *     The dLM
     */
    public Object getDLM() {
        return dLM;
    }

    /**
     * 
     * @param dLM
     *     The DLM
     */
    public void setDLM(Object dLM) {
        this.dLM = dLM;
    }

}
