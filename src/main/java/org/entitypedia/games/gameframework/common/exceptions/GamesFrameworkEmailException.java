package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 500)
public class GamesFrameworkEmailException extends GamesFrameworkException {

    public GamesFrameworkEmailException(Object... params) {
        super(getFormattedMessage(GamesFrameworkEmailException.class.getSimpleName(), params));
        this.params = params;
    }
}