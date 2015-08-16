package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class GameNotFoundException extends GamesFrameworkException {

    public GameNotFoundException(Object... params) {
        super(getFormattedMessage(GameNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}