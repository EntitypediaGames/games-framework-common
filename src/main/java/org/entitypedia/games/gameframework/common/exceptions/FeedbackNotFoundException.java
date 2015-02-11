package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class FeedbackNotFoundException extends GamesFrameworkException {

    public FeedbackNotFoundException(Object... params) {
        super(getFormattedMessage(FeedbackNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}