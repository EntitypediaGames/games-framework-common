package org.entitypedia.games.gameframework.common.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.List;

/**
 * Template for clues coming from Entitypedia.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class ClueTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * Language code of the clue template.
     */
    private String languageCode;

    /**
     * A descriptive name.
     */
    private String name;

    /**
     * EQL query.
     */
    private String query;

    /**
     * Author-assigned difficulty.
     * A derivative from number of attributes used in the template and their distance from the answer.
     */
    private Integer difficulty;

    /**
     * Template of the content with placeholders, for example "... is a %1 in %2"
     */
    private String template;

    @JsonManagedReference("clueTemplate-placeholders")
    private List<ClueTemplatePlaceholder> templatePlaceholders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<ClueTemplatePlaceholder> getTemplatePlaceholders() {
        return templatePlaceholders;
    }

    public void setTemplatePlaceholders(List<ClueTemplatePlaceholder> templatePlaceholders) {
        this.templatePlaceholders = templatePlaceholders;
    }
}