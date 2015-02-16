package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.exceptions.AccessDeniedException;
import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.exceptions.DuplicateEmailException;
import org.entitypedia.games.gameframework.common.exceptions.DeveloperNotFoundException;
import org.entitypedia.games.gameframework.common.exceptions.InvalidPasswordResetCodeException;
import org.entitypedia.games.gameframework.common.exceptions.PasswordResetCodeNotFoundException;
import org.entitypedia.games.gameframework.common.exceptions.TooManyRecentPendingPasswordResetsException;
import org.entitypedia.games.gameframework.common.model.Developer;

/**
 * API for managing developers.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring.mvc.doclet.path developers
 */
public interface IDeveloperAPI {

    String LOGIN_DEVELOPER = "developers/login";
    String RESET_DEVELOPER_PASSWORD = "developers/resetPassword";
    String REQUEST_DEVELOPER_PASSWORD_RESET = "developers/requestPasswordReset";
    String READ_DEVELOPER = "developer/{developerID}";
    String UPDATE_DEVELOPER_PASSWORD = "developers/updatePassword";
    String UPDATE_DEVELOPER_EMAIL = "developers/updateEmail";
    String UPDATE_DEVELOPER_FIRST_NAME = "developers/updateFirstName";
    String UPDATE_DEVELOPER_LAST_NAME = "developers/updateLastName";
    String LIST_DEVELOPERS = "developers";

    /**
     * Login (just checks credentials).
     * <p>
     * Throws {@link AccessDeniedException} if authentication fails.
     */
    void loginDeveloper();

    /**
     * Reads particular developer by id or uid. IDs are numerical.
     * <p>
     * Throws {@link DeveloperNotFoundException} is developer is not found.<br>
     *
     * @param developerID id of the developer to read.
     * @return developer structure
     */
    Developer readDeveloper(long developerID);

    /**
     * Resets the password of the account to the new one.
     * <p>
     * Throws {@link PasswordResetCodeNotFoundException} if password reset code is not found.<br>
     * Throws {@link InvalidPasswordResetCodeException} if password reset is already completed.<br>
     *
     * @param code     password reset authorization code
     * @param password new password
     */
    void resetDeveloperPassword(String code, String password);

    /**
     * Sends password reset code to the developer's email.
     * <p>
     * Throws {@link TooManyRecentPendingPasswordResetsException} if password reset count if over quota.
     *
     * @param email developer's email
     */
    void requestDeveloperPasswordReset(String email);

    /**
     * Updates developer password.
     * <p>
     * Throws {@link DeveloperNotFoundException} is developer is not found.<br>
     *
     * @param developerID id of the developer
     * @param password    new password
     */
    void updateDeveloperPassword(long developerID, String password);

    /**
     * Updates developer email.
     * <p>
     * Throws {@link DeveloperNotFoundException} is developer is not found.<br>
     * Throws {@link DuplicateEmailException} if there is already a registered developer with the same email.<br>
     *
     * @param developerID id of the developer
     * @param email       new email
     */
    void updateDeveloperEmail(long developerID, String email);

    /**
     * Updates developer first name.
     * <p>
     * Throws {@link DeveloperNotFoundException} is developer is not found.<br>
     *
     * @param developerID id of the developer
     * @param firstName   new first name
     */
    void updateDeveloperFirstName(long developerID, String firstName);

    /**
     * Updates developer last name.
     * <p>
     * Throws {@link DeveloperNotFoundException} is developer is not found.<br>
     *
     * @param developerID id of the developer
     * @param lastName    new last name
     */
    void updateDeveloperLastName(long developerID, String lastName);

    /**
     * Lists developers.
     * <p>
     * Throws {@link IllegalArgumentException} if {@code pageNo} or {@code pageSize} is out of bounds.<br>
     *
     * @param pageSize pageSize, default 9, max 100
     * @param pageNo   0-based page number
     * @param filter   filter expression. example: creator.id eq 1 or published eq true or creationTime ge '20130101'
     * @param order    order expression. example: Alayout.rowCount-Dlayout.columnCount
     * @return a page of developers
     */
    ResultsPage<Developer> listDevelopers(Integer pageSize, Integer pageNo, String filter, String order);
}