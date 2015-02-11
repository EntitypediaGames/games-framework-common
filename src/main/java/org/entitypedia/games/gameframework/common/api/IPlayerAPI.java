package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.exceptions.AccessDeniedException;
import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.exceptions.*;
import org.entitypedia.games.gameframework.common.model.Player;

/**
 * API for managing players.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring.mvc.doclet.path players
 */
public interface IPlayerAPI {

    final String LOGIN_PLAYER = "players/login";
    final String ACTIVATE_PLAYER_EMAIL = "players/activateEmail";
    final String REQUEST_PLAYER_EMAIL_ACTIVATION = "players/requestEmailActivation";
    final String RESET_PLAYER_PASSWORD = "players/resetPassword";
    final String REQUEST_PLAYER_PASSWORD_RESET = "players/requestPasswordReset";
    final String LOGIN_FACEBOOK_PLAYER = "players/loginFacebook";
    final String LOGIN_GPLUS_PLAYER = "players/loginGPlus";
    final String CREATE_PLAYER = "players/create";
    final String READ_PLAYER = "player/{playerID}";
    final String DELETE_PLAYER = "players/delete";
    final String UPDATE_PLAYER = "players/update";
    final String UPDATE_PLAYER_PASSWORD = "players/updatePassword";
    final String UPDATE_PLAYER_EMAIL = "players/updateEmail";
    final String UPDATE_PLAYER_FIRST_NAME = "players/updateFirstName";
    final String UPDATE_PLAYER_LAST_NAME = "players/updateLastName";
    final String UPDATE_PLAYER_FACEBOOK = "players/updateFacebook";
    final String UPDATE_PLAYER_GPLUS = "players/updateGPlus";
    final String LIST_PLAYERS = "players";

    /**
     * Login (just checks credentials).
     * <p>
     * Throws {@link AccessDeniedException} if authentication fails.
     */
    void login();

    /**
     * Logs in Facebook account.
     *
     * @param token Facebook authorization token
     * @return player instance
     */
    Player loginFacebook(String token);

    /**
     * Logs in GPlus account.
     *
     * @param code GPlus authorization code
     * @return player instance
     */
    Player loginGPlus(String code);

    /**
     * Marks player email as really owned by the player.
     * <p>
     * Throws {@link ActivationCodeNotFoundException} if activation code is not recognized.
     *
     * @param code activation code from the activation message
     */
    void activateEmail(String code);

    /**
     * Sends an activation code to the player's email to confirm ownership.
     * <p>
     * Throws {@link TooManyPendingActivationAttemptsException} if there are too many pending activation requests.<br>
     * Throws {@link TooManyRecentPendingActivationAttemptsException} if there are too many activation attempts.<br>
     */
    void requestEmailActivation();

    /**
     * Resets the password of the account to the new one.
     * <p>
     * Throws {@link PasswordResetCodeNotFoundException} if password reset code is not found.<br>
     * Throws {@link InvalidPasswordResetCodeException} if password reset is already completed.<br>
     *
     * @param code     password reset authorization code
     * @param password new password
     */
    void resetPassword(String code, String password);

    /**
     * Sends password reset code to the player's email.
     * <p>
     * Throws {@link TooManyRecentPendingPasswordResetsException} if password reset count if over quota.
     *
     * @param email player's email
     */
    void requestPasswordReset(String email);

    /**
     * Creates a player.
     * <p>
     * Throws {@link DuplicateEmailException} if there is already a registered player with the same email.<br>
     *
     * @param player player structure
     * @return player structure
     */
    Player createPlayer(Player player);

    /**
     * Retrieves a particular player by id or uid. IDs are numerical, while UIDs start with "p".
     * Reserved "current" value of playerID returns currently authenticated player
     * (useful for games which might need to retrieve game framework account id).
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     *
     * @param playerID id of the player to retrieve.
     * @return player structure
     */
    Player readPlayer(String playerID);

    /**
     * Retrieves a particular player by id.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     *
     * @param playerID player id
     * @return player structure
     */
    public Player readPlayer(long playerID);

    /**
     * Deletes a player.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     *
     * @param playerID id of a player to delete
     */
    void deletePlayer(long playerID);

    /**
     * Updates a player.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     * Throws {@link DuplicateEmailException} if there is already a registered player with the same email.<br>
     *
     * @param player player to update
     */
    void updatePlayer(Player player);

    /**
     * Updates player password.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     *
     * @param playerID id of the player
     * @param password new password
     */
    void updatePlayerPassword(long playerID, String password);

    /**
     * Updates player email.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     * Throws {@link DuplicateEmailException} if there is already a registered player with the same email.<br>
     *
     * @param playerID id of the player
     * @param email    new email
     */
    void updatePlayerEmail(long playerID, String email);

    /**
     * Updates player first name.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     *
     * @param playerID  id of the player
     * @param firstName new first name
     */
    void updatePlayerFirstName(long playerID, String firstName);

    /**
     * Updates player last name.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     *
     * @param playerID id of the player
     * @param lastName new last name
     */
    void updatePlayerLastName(long playerID, String lastName);

    /**
     * Updates player Facebook connection data.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     * Throws {@link FacebookAccountAlreadyConnectedException} is player already has connected Facebook account.<br>
     *
     * @param playerID id of the player
     * @param token    Facebook access token. Empty string removes the connection with Facebook.
     */
    void updatePlayerFacebook(long playerID, String token);

    /**
     * Updates player GPlus connection data.
     * <p>
     * Throws {@link PlayerNotFoundException} is player is not found.<br>
     * Throws {@link GPlusAccountAlreadyConnectedException} is player already has connected GPlus account.<br>
     *
     * @param playerID id of the player
     * @param code     GPlus access code. Empty string removes the connection with GPlus.
     */
    void updatePlayerGPlus(long playerID, String code);

    /**
     * Lists players.
     * <p>
     * Throws {@link IllegalArgumentException} if {@code pageNo} or {@code pageSize} is out of bounds.<br>
     *
     * @param pageSize pageSize, default 9, max 100
     * @param pageNo   0-based page number
     * @return a page of players
     */
    ResultsPage<Player> listPlayers(Integer pageSize, Integer pageNo);
}
