package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 500)
public class InvalidGPlusTokenException extends GamesFrameworkException {

    public InvalidGPlusTokenException(Object... params) {
        super(getFormattedMessage(InvalidGPlusTokenException.class.getSimpleName(), params));
        this.params = params;
    }
}