package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class TooManyPendingActivationAttemptsException extends GameFrameworkException {

    public TooManyPendingActivationAttemptsException(Object... params) {
        super(getFormattedMessage(TooManyPendingActivationAttemptsException.class.getSimpleName(), params));
        this.params = params;
    }
}