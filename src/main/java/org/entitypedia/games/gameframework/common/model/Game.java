package org.entitypedia.games.gameframework.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;

/**
 * Game information.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @JsonManagedReference("game-developer")
    @JsonIgnore
    private Developer developer;

    private String title;

    private String description;

    private String url;

    private String logoURL;

    private String OAuthCallbackURL;

    private String OAuthSecret;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public String getOAuthCallbackURL() {
        return OAuthCallbackURL;
    }

    public void setOAuthCallbackURL(String OAuthCallbackURL) {
        this.OAuthCallbackURL = OAuthCallbackURL;
    }

    public String getOAuthSecret() {
        return OAuthSecret;
    }

    public void setOAuthSecret(String OAuthSecret) {
        this.OAuthSecret = OAuthSecret;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}