package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.model.Player;

/**
 * API for managing players.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public interface IPlayerAPI {

    final String LOGIN_PLAYER = "players/login";
    final String ACTIVATE_PLAYER_EMAIL = "players/activateEmail";
    final String REQUEST_PLAYER_EMAIL_ACTIVATION = "players/requestEmailActivation";
    final String RESET_PLAYER_PASSWORD = "players/resetPassword";
    final String REQUEST_PLAYER_PASSWORD_RESET = "players/requestPasswordReset";
    final String LOGIN_FACEBOOK_PLAYER = "players/loginFacebook";
    final String CREATE_PLAYER = "players/create";
    final String READ_PLAYER = "player/{playerID}";
    final String DELETE_PLAYER = "players/delete";
    final String UPDATE_PLAYER = "players/update";
    final String UPDATE_PLAYER_PASSWORD = "players/updatePassword";
    final String UPDATE_PLAYER_EMAIL = "players/updateEmail";
    final String UPDATE_PLAYER_FIRST_NAME = "players/updateFirstName";
    final String UPDATE_PLAYER_LAST_NAME = "players/updateLastName";
    final String UPDATE_PLAYER_FACEBOOK = "players/updateFacebook";
    final String LIST_PLAYERS = "players";

    /**
     * Login (just to check credentials).
     */
    void login();

    /**
     * Logs in Facebook account.
     */
    Player loginFacebook(String token);

    /**
     * Marks player email as really owned by the player.
     *
     * @param code activation code from the activation message
     */
    void activateEmail(String code);

    /**
     * Sends an activation code to the player's email to confirm ownership.
     */
    void requestEmailActivation();

    /**
     * Resets the password of the account to the new one.
     *
     * @param code     password reset authorization code
     * @param password new password
     */
    void resetPassword(String code, String password);

    /**
     * Sends password reset code to player's email.
     *
     * @param email player's email
     */
    void requestPasswordReset(String email);

    /**
     * Creates a player.
     *
     * @param player player structure in JSON format
     * @return player structure in JSON format
     */
    Player createPlayer(Player player);

    /**
     * Retrieves a particular player by id or uid. IDs are numerical, while UIDs start with "p".
     *
     * @param playerID is the id of the player we want to retrieve
     * @return player structure in JSON format
     */
    Player readPlayer(String playerID);

    /**
     * Retrieves a particular player by id.
     *
     * @param playerID player id
     * @return player structure in JSON format
     */
    public Player readPlayer(long playerID);

    /**
     * Deletes a player.
     *
     * @param playerID id of a player to delete
     */
    void deletePlayer(long playerID);

    /**
     * Updates a player.
     *
     * @param player player to update
     */
    void updatePlayer(Player player);

    /**
     * Updates player password.
     *
     * @param playerID id of the player
     * @param password new password
     */
    void updatePlayerPassword(long playerID, String password);

    /**
     * Updates player email.
     *
     * @param playerID id of the player
     * @param email    new email
     */
    void updatePlayerEmail(long playerID, String email);

    /**
     * Updates player first name.
     *
     * @param playerID  id of the player
     * @param firstName new first name
     */
    void updatePlayerFirstName(long playerID, String firstName);

    /**
     * Updates player last name.
     *
     * @param playerID id of the player
     * @param lastName new last name
     */
    void updatePlayerLastName(long playerID, String lastName);

    /**
     * Updates player Facebook connection data.
     *
     * @param playerID id of the player
     * @param token    Facebook access token. Empty string removes the connection with Facebook.
     */
    void updatePlayerFacebook(long playerID, String token);

    /**
     * Lists players.
     *
     * @param pageSize pageSize
     * @param pageNo   0-based page number
     */
    ResultsPage<Player> listPlayers(Integer pageSize, Integer pageNo);
}
