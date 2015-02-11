package org.entitypedia.games.gameframework.common.model;

import org.entitypedia.games.gameframework.common.exceptions.IllegalWordDifficultyValueException;

import java.io.Serializable;

/**
 * Word as used in word games. For example, "apple".
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Word implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * The word itself
     */
    private String word;

    /**
     * ISO language code
     */
    private String languageCode;

    /**
     * Word frequency in some text collection, now sourced from Google NGram
     */
    private Long frequency;

    /**
     * Word difficulty level: from 1 = very easy to 5 = very hard
     */
    private Integer difficulty;

    private Boolean hasMediaClues;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Long getFrequency() {
        return frequency;
    }

    public void setFrequency(Long frequency) {
        this.frequency = frequency;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        if (null != difficulty && 0 < difficulty && difficulty <= 5) {
            this.difficulty = difficulty;
        } else {
            if (null != difficulty) {
                throw new IllegalWordDifficultyValueException(difficulty);
            } else {
                this.difficulty = null;
            }
        }
    }

    public Boolean getHasMediaClues() {
        return hasMediaClues;
    }

    public void setHasMediaClues(Boolean hasMediaClues) {
        this.hasMediaClues = hasMediaClues;
    }
}