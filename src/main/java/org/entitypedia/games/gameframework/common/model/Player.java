package org.entitypedia.games.gameframework.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * Player.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Date creationTime;

    /**
     * Unique identifier. Random generated sequence of letters and numbers, starts with "p".
     */
    private String uid;

    private String password;

    private String email;

    /**
     * True if the email was verified
     */
    private Boolean emailActive;

    private String firstName;

    private String lastName;

    /**
     * ID of the Facebook account of this player
     */
    private String facebookId;

    /**
     * Facebook long-term security token to authenticate on behalf of the player
     */
    @JsonIgnore
    private String facebookToken;

    /**
     * Facebook token expiration date
     */
    @JsonIgnore
    private Date facebookTokenExpiry;

    /**
     * ID of the Google+ account of this player
     */
    private String gplusId;

    /**
     * Google+ security access token to authenticate on behalf of the player
     */
    @JsonIgnore
    private String gplusAToken;

    /**
     * Google+ security access token expiration date
     */
    @JsonIgnore
    private Date gplusATokenExpiry;

    /**
     * Google+ security access refresh token to obtain new access tokens
     */
    @JsonIgnore
    private String gplusRToken;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailActive() {
        return emailActive;
    }

    public void setEmailActive(Boolean emailActive) {
        this.emailActive = emailActive;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getFacebookToken() {
        return facebookToken;
    }

    public void setFacebookToken(String facebookToken) {
        this.facebookToken = facebookToken;
    }

    public Date getFacebookTokenExpiry() {
        return facebookTokenExpiry;
    }

    public void setFacebookTokenExpiry(Date facebookTokenExpiry) {
        this.facebookTokenExpiry = facebookTokenExpiry;
    }

    public String getGplusId() {
        return gplusId;
    }

    public void setGplusId(String gplusId) {
        this.gplusId = gplusId;
    }

    public String getGplusAToken() {
        return gplusAToken;
    }

    public void setGplusAToken(String gplusAToken) {
        this.gplusAToken = gplusAToken;
    }

    public String getGplusRToken() {
        return gplusRToken;
    }

    public void setGplusRToken(String gplusRToken) {
        this.gplusRToken = gplusRToken;
    }

    public Date getGplusATokenExpiry() {
        return gplusATokenExpiry;
    }

    public void setGplusATokenExpiry(Date gplusATokenExpiry) {
        this.gplusATokenExpiry = gplusATokenExpiry;
    }
}