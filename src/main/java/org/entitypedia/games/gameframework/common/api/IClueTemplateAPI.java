package org.entitypedia.games.gameframework.common.api;

import org.entitypedia.games.common.exceptions.FilterParsingException;
import org.entitypedia.games.common.exceptions.OrderParsingException;
import org.entitypedia.games.common.model.ResultsPage;
import org.entitypedia.games.gameframework.common.exceptions.ClueTemplateNotFoundException;
import org.entitypedia.games.gameframework.common.model.ClueTemplate;

/**
 * API for working with clue templates. Clue template is a basically an EQL query with some text templates which
 * make clues out of Entitypedia entities.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 * @spring.mvc.doclet.path clueTemplates
 */
public interface IClueTemplateAPI {

    String READ_CLUE_TEMPLATE = "clueTemplate/{clueTemplateID}";
    String LIST_CLUE_TEMPLATES = "clueTemplates";

    /**
     * Retrieves a particular clue template by id.
     * <p>
     * Throws {@link ClueTemplateNotFoundException} if {@code clueTemplateID} is not found.
     * <p>
     * Available for developers or games.
     *
     * @param clueTemplateID id of the clue template to read
     * @return clue template structure
     */
    ClueTemplate readClueTemplate(long clueTemplateID);

    /**
     * Lists clue templates.
     * <p>
     * Throws {@link IllegalArgumentException} if {@code pageNo} or {@code pageSize} is out of bounds.<br>
     * Throws {@link OrderParsingException} if {@code order} syntax is wrong.<br>
     * Throws {@link FilterParsingException} if {@code filter} syntax is wrong.<br>
     * <p>
     * Available for developers or games.
     *
     * @param pageSize pageSize, default 9, max 100
     * @param pageNo   0-based page number
     * @param filter   filter expression. example: creator.id eq 1 or published eq true or creationTime ge '20130101'
     * @param order    order expression. example: Alayout.rowCount-Dlayout.columnCount
     * @return a page of clue templates
     */
    ResultsPage<ClueTemplate> listClueTemplates(Integer pageSize, Integer pageNo, String filter, String order);
}