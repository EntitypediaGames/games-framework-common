package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * Thrown if email in the player profile does not equal to the in the activation code.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class ActivationEmailDiffersException extends GameFrameworkException {

    public ActivationEmailDiffersException(Object... params) {
        super(getFormattedMessage(ActivationEmailDiffersException.class.getSimpleName(), params));
        this.params = params;
    }
}