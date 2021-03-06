package org.entitypedia.games.gameframework.common.exceptions;

import org.entitypedia.games.common.exceptions.HTTPResponseStatus;

/**
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
@HTTPResponseStatus(value = 400)
public class FacebookAccountAlreadyConnectedException extends GamesFrameworkException {

    public FacebookAccountAlreadyConnectedException(Object... params) {
        super(getFormattedMessage(FacebookAccountAlreadyConnectedException.class.getSimpleName(), params));
        this.params = params;
    }
}