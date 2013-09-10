package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.model.Clue;

/**
 * API for working with clues.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public interface IClueAPI {

    final String READ_CLUE = "clue/{clueID}";
    final String LIST_CLUES = "clues";

    /**
     * Retrieves a particular clue by id.
     *
     * @param clueID is the id of the clue we want to retrieve
     * @return clue structure
     */
    Clue readClue(long clueID);

    /**
     * Lists clues. See {@link org.entitypedia.games.common.repository.hibernateimpl.filter.FilterCriteriaParser.parse}
     * for details on filter expression syntax.
     *
     * @param pageSize pageSize
     * @param pageNo   0-based page number
     * @param filter   filter expression
     * @param order    order expression: dash separated list of field names prefixed with D or A for descending or ascending respectively
     */
    ResultsPage<Clue> listClues(Integer pageSize, Integer pageNo, String filter, String order);
}