package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class EmailIsNotActivatedException extends GamesFrameworkException {

    public EmailIsNotActivatedException(Object... params) {
        super(getFormattedMessage(EmailIsNotActivatedException.class.getSimpleName(), params));
        this.params = params;
    }
}