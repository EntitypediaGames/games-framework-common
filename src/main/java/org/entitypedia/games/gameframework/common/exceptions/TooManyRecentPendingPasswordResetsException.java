package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class TooManyRecentPendingPasswordResetsException extends GamesFrameworkException {

    public TooManyRecentPendingPasswordResetsException(Object... params) {
        super(getFormattedMessage(TooManyRecentPendingPasswordResetsException.class.getSimpleName(), params));
        this.params = params;
    }
}