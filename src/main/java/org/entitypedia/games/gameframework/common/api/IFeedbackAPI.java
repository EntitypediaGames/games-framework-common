package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.gameframework.common.model.Feedback;

/**
 * API for submitting feedback.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring-mvc-doclet.path feedback
 */
public interface IFeedbackAPI {

    final String CREATE_FEEDBACK = "feedback/create";
    final String POST_FEEDBACK = "feedback/post";
    final String CANCEL_FEEDBACK = "feedback/cancel";

    /**
     * Creates a feedback item.
     *
     * @param clueID clue to create feedback for
     * @return feedback item
     */
    Feedback createFeedback(long clueID);

    /**
     * Submits feedback item.
     *
     * @param feedbackID        feedback item
     * @param attributePosition position of the attribute to correct
     * @param attributeValue    corrected value
     * @param comment           comment
     */
    void postFeedback(long feedbackID, int attributePosition, String attributeValue, String comment);

    /**
     * Cancels feedback submission.
     *
     * @param feedbackID feedback item to cancel
     */
    void cancelFeedback(long feedbackID);
}