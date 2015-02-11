package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class TooManyRecentPendingActivationAttemptsException extends GamesFrameworkException {

    public TooManyRecentPendingActivationAttemptsException(Object... params) {
        super(getFormattedMessage(TooManyRecentPendingActivationAttemptsException.class.getSimpleName(), params));
        this.params = params;
    }
}