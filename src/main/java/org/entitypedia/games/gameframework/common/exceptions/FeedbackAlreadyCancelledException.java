package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class FeedbackAlreadyCancelledException extends GamesFrameworkException {

    public FeedbackAlreadyCancelledException(Object... params) {
        super(getFormattedMessage(FeedbackAlreadyCancelledException.class.getSimpleName(), params));
        this.params = params;
    }
}