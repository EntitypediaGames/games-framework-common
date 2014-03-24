package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.model.Word;

/**
 * API for working with words.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring-mvc-doclet.path words
 */
public interface IWordAPI {

    final String READ_WORD = "word/{wordID}";
    final String LIST_WORDS = "words";

    /**
     * Retrieves a particular word by id.
     *
     * @param wordID id of the word to retrieve
     * @return word structure
     */
    Word readWord(long wordID);

    /**
     * Lists words. In the resulting page overallCount might equal -1, which means
     * that total amount of items being returned is unknown. In this case pagesCount will equal -1 too.
     * The client in this case should keep reading the pages till the page returned is not empty.
     *
     * @param pageSize pageSize, default 9, max 100
     * @param pageNo   0-based page number
     * @param filter   filter expression. example: creator.id eq 1 or published eq true or creationTime ge '20130101'
     * @param order    order expression. example: Alayout.rowCount-Dlayout.columnCount
     */
    ResultsPage<Word> listWords(Integer pageSize, Integer pageNo, String filter, String order);
}
