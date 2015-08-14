package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.gameframework.common.exceptions.ClueNotFoundException;
import org.entitypedia.games.gameframework.common.exceptions.FeedbackAlreadyCancelledException;
import org.entitypedia.games.gameframework.common.exceptions.FeedbackAlreadyPostedException;
import org.entitypedia.games.gameframework.common.exceptions.FeedbackNotFoundException;
import org.entitypedia.games.gameframework.common.model.Feedback;

/**
 * API for submitting feedback.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring.mvc.doclet.path feedback
 */
public interface IFeedbackAPI {

    String CREATE_FEEDBACK = "feedback/create";
    String POST_FEEDBACK = "feedback/post";
    String CANCEL_FEEDBACK = "feedback/cancel";
    String CONFIRM_CLUE = "feedback/confirmClue";

    /**
     * Creates a feedback item.
     * <p>
     * Throws {@link ClueNotFoundException} if clue referred by {@code clueID} is not found.<br>
     * <p>
     * Available for players.
     *
     * @param clueID clue to create feedback for
     * @return feedback item
     */
    Feedback createFeedback(long clueID);

    /**
     * Submits feedback item.
     * <p>
     * Throws {@link FeedbackNotFoundException} if feedback item referred by {@code feedbackID} is not found.<br>
     * Throws {@link FeedbackAlreadyPostedException} if feedback item is already posted.<br>
     * Throws {@link FeedbackAlreadyCancelledException} if feedback item is already canceled.<br>
     * Throws {@link ArrayIndexOutOfBoundsException} if {@code attributePosition} is out of bounds.<br>
     * <p>
     * Available for players.
     *
     * @param feedbackID        feedback item
     * @param attributePosition position of the attribute to correct
     * @param attributeValue    corrected value
     * @param comment           comment
     */
    void postFeedback(long feedbackID, int attributePosition, String attributeValue, String comment);

    /**
     * Cancels feedback submission.
     * <p>
     * Throws {@link FeedbackNotFoundException} if feedback item referred by {@code feedbackID} is not found.<br>
     * Throws {@link FeedbackAlreadyPostedException} if feedback item is already posted.<br>
     * Throws {@link FeedbackAlreadyCancelledException} if feedback item is already canceled.<br>
     * <p>
     * Available for players.
     *
     * @param feedbackID feedback item to cancel
     */
    void cancelFeedback(long feedbackID);

    /**
     * Confirms clue correctness by interpreting players' input as confidence measure.
     * <p>
     * Throws {@link ClueNotFoundException} if clue referred by {@code clueID} is not found.<br>
     * Throws {@link IllegalArgumentException} if confidence is out of [0, 1] interval.<br>
     * <p>
     * Available for games on behalf of players.
     *
     * @param clueID clue to confirm
     * @param confidence confidence of player's knowledge, 0 to 1
     */
    void confirmClue(long clueID, double confidence);
}