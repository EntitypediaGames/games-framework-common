package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class PasswordResetCodeNotFoundException extends GamesFrameworkException {

    public PasswordResetCodeNotFoundException(Object... params) {
        super(getFormattedMessage(PasswordResetCodeNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}