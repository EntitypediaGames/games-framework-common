package org.entitypedia.games.gameframework.common.model;

import org.entitypedia.games.common.model.WordGameUser;

import java.util.Date;

/**
 * Player information.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Player extends WordGameUser {

    private static final long serialVersionUID = 1L;

    private String email;

    private String firstName;

    private String lastName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public void setCreationTime(Date creationTime) {
        super.setCreationTime(creationTime);
    }

    @Override
    public void setUid(String uid) {
        super.setUid(uid);
    }
}