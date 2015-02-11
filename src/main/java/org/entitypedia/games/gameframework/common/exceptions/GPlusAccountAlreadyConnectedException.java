package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class GPlusAccountAlreadyConnectedException extends GamesFrameworkException {

    public GPlusAccountAlreadyConnectedException(Object... params) {
        super(getFormattedMessage(GPlusAccountAlreadyConnectedException.class.getSimpleName(), params));
        this.params = params;
    }
}