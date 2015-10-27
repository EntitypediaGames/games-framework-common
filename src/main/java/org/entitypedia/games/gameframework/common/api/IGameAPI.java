package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.model.Game;

/**
 * API for managing game instances.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring.mvc.doclet.path games
 */
public interface IGameAPI {

    String CREATE_GAME = "games/create";
    String READ_GAME = "game/{gameID}";
    String UPDATE_GAME_TITLE = "games/updateTitle";
    String UPDATE_GAME_DESCRIPTION = "games/updateDescription";
    String UPDATE_GAME_URL = "games/updateURL";
    String UPDATE_GAME_LOGO_URL = "games/updateLogoURL";
    String UPDATE_GAME_SLIDER_URL = "games/updateSliderURL";
    String UPDATE_GAME_OAUTH_CALLBACK_URL = "games/updateOAuthCallbackURL";
    String UPDATE_GAME_OAUTH_SECRET = "games/updateOAuthSecret";
    String UPDATE_GAME_PRODUCTION = "games/updateProduction";
    String DELETE_GAME = "games/delete";
    String LIST_GAMES = "games";

    /**
     * Creates a game instance.
     * <p>
     * Available for developers.</p>
     *
     * @return game instance
     */
    Game createGame();

    /**
     * Reads a particular game instance by id.
     * <p>
     * Available for unauthenticated.</p>
     *
     * @param gameID id of the game
     * @return game instance
     */
    Game readGame(long gameID);

    /**
     * Updates game title.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID id of the game
     * @param title  new title, up to 255 chars
     */
    void updateGameTitle(long gameID, String title);

    /**
     * Updates game description.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID      id of the game
     * @param description new description
     */
    void updateGameDescription(long gameID, String description);

    /**
     * Updates game url.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID id of the game
     * @param url    new url, up to 255 chars
     */
    void updateGameURL(long gameID, String url);

    /**
     * Updates game logo url. Current design accommodates 160x160 logos.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID id of the game
     * @param url    new url, up to 255 chars
     */
    void updateGameLogoURL(long gameID, String url);

    /**
     * Updates game slider url. Current design accommodates 1200x320 slider images.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID id of the game
     * @param url    new url, up to 255 chars
     */
    void updateGameSliderURL(long gameID, String url);

    /**
     * Updates game OAuth callback url.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID id of the game
     * @param url    new url, up to 255 chars
     */
    void updateGameOAuthCallbackURL(long gameID, String url);

    /**
     * Updates game OAuth secret.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID id of the game
     * @param secret new secret, up to 255 chars
     */
    void updateGameOAuthSecret(long gameID, String secret);

    /**
     * Updates game production flag. Only production-ready games are shown in the API and on the site.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID     id of the game
     * @param production new production flag
     */
    void updateGameProduction(long gameID, boolean production);

    /**
     * Deletes game instance.
     * <p>
     * Available for developers.</p>
     *
     * @param gameID id of the game
     */
    void deleteGame(long gameID);

    /**
     * Lists games.
     * <p>
     * Throws {@link IllegalArgumentException} if {@code pageNo} or {@code pageSize} is out of bounds.</p>
     * <p>
     * Available for unauthorized.</p>
     *
     * @param pageSize pageSize, default 9, max 100
     * @param pageNo   0-based page number
     * @return a page of games
     */
    ResultsPage<Game> listGames(Integer pageSize, Integer pageNo);
}
