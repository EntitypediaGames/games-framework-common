package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class FeedbackAlreadyPostedException extends GameFrameworkException {

    public FeedbackAlreadyPostedException(Object... params) {
        super(getFormattedMessage(FeedbackAlreadyPostedException.class.getSimpleName(), params));
        this.params = params;
    }
}