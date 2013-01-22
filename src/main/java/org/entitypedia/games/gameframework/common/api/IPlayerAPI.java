package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.model.Player;

/**
 * API for managing players.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public interface IPlayerAPI {

    final String LOGIN_PLAYER = "player/login";
    final String CREATE_PLAYER = "player/create";
    final String READ_PLAYER = "player/{playerID}";
    final String DELETE_PLAYER = "player/delete";
    final String UPDATE_PLAYER = "player/update";
    final String UPDATE_PLAYER_PASSWORD = "players/updatePassword";
    final String UPDATE_PLAYER_EMAIL = "players/updateEmail";
    final String UPDATE_PLAYER_FIRST_NAME = "players/updateFirstName";
    final String UPDATE_PLAYER_LAST_NAME = "players/updateLastName";
    final String LIST_PLAYERS = "players";

    /**
     * Login (just to check credentials).
     */
    void login();

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
     * @param email new email
     */
    void updatePlayerEmail(long playerID, String email);

    /**
     * Updates player first name.
     *
     * @param playerID id of the player
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
     * Lists players.
     *
     * @param pageSize pageSize
     * @param pageNo   0-based page number
     */
    ResultsPage<Player> listPlayers(Integer pageSize, Integer pageNo);
}
