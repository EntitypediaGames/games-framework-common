package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class ActivationCodeNotFoundException extends GameFrameworkException {

    public ActivationCodeNotFoundException(Object... params) {
        super(getFormattedMessage(ActivationCodeNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}