package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.exceptions.FilterParsingException;
import org.entitypedia.games.common.exceptions.OrderParsingException;
import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.exceptions.ClueNotFoundException;
import org.entitypedia.games.gameframework.common.model.Clue;

/**
 * API for working with clues.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring-mvc-doclet.path clues
 */
public interface IClueAPI {

    final String READ_CLUE = "clue/{clueID}";
    final String LIST_CLUES = "clues";

    /**
     * Retrieves a particular clue by id.
     * <p>
     * Throws {@link ClueNotFoundException} if {@code clueID} is not found.
     *
     * @param clueID id of the clue to retrieve
     * @return clue structure
     */
    Clue readClue(long clueID);

    /**
     * Lists clues.
     * <p>
     * Throws {@link IllegalArgumentException} if {@code pageNo} or {@code pageSize} is out of bounds.<br/>
     * Throws {@link OrderParsingException} if {@code order} syntax is wrong.<br/>
     * Throws {@link FilterParsingException} if {@code filter} syntax is wrong.<br/>
     *
     * @param pageSize pageSize, default 9, max 100
     * @param pageNo   0-based page number
     * @param filter   filter expression. example: creator.id eq 1 or published eq true or creationTime ge '20130101'
     * @param order    order expression. example: Alayout.rowCount-Dlayout.columnCount
     */
    ResultsPage<Clue> listClues(Integer pageSize, Integer pageNo, String filter, String order);
}