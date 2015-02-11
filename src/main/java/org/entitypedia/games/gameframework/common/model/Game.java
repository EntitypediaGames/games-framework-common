package org.entitypedia.games.gameframework.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;

/**
 * A game instance.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @JsonManagedReference("game-developer")
    @JsonIgnore
    private Developer developer;

    /**
     * Game title. For example, "Entitypedia Crosswords".
     */
    private String title;

    /**
     * Game description. A couple of sentences, up to a paragraph, plain text description of the game.
     */
    private String description;

    /**
     * The URL where the game can be played
     */
    private String url;

    /**
     * The URL of the logo of the game to use in Games Framework
     */
    private String logoURL;

    /**
     * The URL of the slider image of the game to use on the home page of Games Framework
     */
    private String sliderURL;

    /**
     * The URL of the OAuth callback
     */
    private String OAuthCallbackURL;

    /**
     * The OAuth secret
     */
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

    public String getSliderURL() {
        return sliderURL;
    }

    public void setSliderURL(String sliderURL) {
        this.sliderURL = sliderURL;
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