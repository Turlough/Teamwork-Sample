
package com.example.turlough.teamworksample.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class TaskResponse {

    @SerializedName("STATUS")
    @Expose
    private String status;
    @SerializedName("tasklists")
    @Expose
    private List<Tasklist> tasklists = new ArrayList<Tasklist>();

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
     *     The tasklists
     */
    public List<Tasklist> getTasklists() {
        return tasklists;
    }

    /**
     * 
     * @param tasklists
     *     The tasklists
     */
    public void setTasklists(List<Tasklist> tasklists) {
        this.tasklists = tasklists;
    }

}
