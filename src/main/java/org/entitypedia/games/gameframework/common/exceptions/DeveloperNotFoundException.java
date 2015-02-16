package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class DeveloperNotFoundException extends GamesFrameworkException {

    public DeveloperNotFoundException(Object... params) {
        super(getFormattedMessage(DeveloperNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}