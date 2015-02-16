package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 404)
public class ClueTemplateNotFoundException extends GamesFrameworkException {

    public ClueTemplateNotFoundException(Object... params) {
        super(getFormattedMessage(ClueTemplateNotFoundException.class.getSimpleName(), params));
        this.params = params;
    }
}