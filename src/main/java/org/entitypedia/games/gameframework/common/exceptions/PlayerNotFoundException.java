package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class PlayerNotFoundException extends GameFrameworkException {

    public PlayerNotFoundException(Object... params) {
        super(getFormattedMessage(PlayerNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}