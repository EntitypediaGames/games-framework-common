package org.entitypedia.games.gameframework.common.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;

/**
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class ClueEntityAttribute implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @JsonBackReference("clue-attribute")
    private Clue clue;

    private Long entityId;

    private Long attributeId;

    private Integer attributePosition;

    private String attributeValue;

    private String originalValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clue getClue() {
        return clue;
    }

    public void setClue(Clue clue) {
        this.clue = clue;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getAttributePosition() {
        return attributePosition;
    }

    public void setAttributePosition(Integer attributePosition) {
        this.attributePosition = attributePosition;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }
}
