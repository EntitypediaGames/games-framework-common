package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class FeedbackNotFoundException extends GameFrameworkException {

    public FeedbackNotFoundException(Object... params) {
        super(getFormattedMessage(FeedbackNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}