package org.entitypedia.games.gameframework.common.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;

/**
 * Describes clue template placeholders.
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class ClueTemplatePlaceholder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer positionNo;

    private String hint;

    private String valueReplacement;

    @JsonBackReference("clueTemplate-placeholders")
    private ClueTemplate clueTemplate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPositionNo() {
        return positionNo;
    }

    public void setPositionNo(Integer positionNo) {
        this.positionNo = positionNo;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getValueReplacement() {
        return valueReplacement;
    }

    public void setValueReplacement(String valueReplacement) {
        this.valueReplacement = valueReplacement;
    }

    public ClueTemplate getClueTemplate() {
        return clueTemplate;
    }

    public void setClueTemplate(ClueTemplate clueTemplate) {
        this.clueTemplate = clueTemplate;
    }
}