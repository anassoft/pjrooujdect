
package com.joud.admin.joud.databeans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Posters {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("post_date")
    @Expose
    private String postDate;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("contact_info")
    @Expose
    private String contactInfo;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("poster_type")
    @Expose
    private String posterType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPosterType() {
        return posterType;
    }

    public void setPosterType(String posterType) {
        this.posterType = posterType;
    }
///////////////////////////////////////////////////////////////////////

    @SerializedName("poster_id")
    @Expose
    private String posterId;
    @SerializedName("url")
    @Expose
    private String url;



    public String getPosterId() {
        return posterId;
    }

    public void setPosterId(String posterId) {
        this.posterId = posterId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
