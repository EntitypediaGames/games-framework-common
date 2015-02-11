package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class DuplicateEmailException extends GamesFrameworkException {

    public DuplicateEmailException(Object... params) {
        super(getFormattedMessage(DuplicateEmailException.class.getSimpleName(), params));
        this.params = params;
    }
}