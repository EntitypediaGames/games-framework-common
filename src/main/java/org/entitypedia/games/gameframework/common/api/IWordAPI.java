package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.model.Word;

/**
 * API for working with words.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public interface IWordAPI {

    final String READ_WORD = "word/{wordID}";
    final String LIST_WORDS = "words";

    /**
     * Retrieves a particular word by id.
     *
     * @param wordID is the id of the word we want to retrieve
     * @return word structure
     */
    Word readWord(long wordID);

    /**
     * Lists words.
     *
     * @param pageSize pageSize
     * @param pageNo   0-based page number
     * @param filter   filter expression
     * @param order    order expression: dash separated list of field names prefixed with D or A for descending or ascending respectively
     */
    ResultsPage<Word> listWords(Integer pageSize, Integer pageNo, String filter, String order);
}
