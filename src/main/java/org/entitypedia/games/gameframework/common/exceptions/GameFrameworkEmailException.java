package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 500)
public class GameFrameworkEmailException extends GameFrameworkException {

    public GameFrameworkEmailException(Object... params) {
        super(getFormattedMessage(GameFrameworkEmailException.class.getSimpleName(), params));
        this.params = params;
    }
}