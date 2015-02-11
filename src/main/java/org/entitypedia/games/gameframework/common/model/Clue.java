package org.entitypedia.games.gameframework.common.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.entitypedia.games.gameframework.common.exceptions.IllegalClueDifficultyValueException;

import java.io.Serializable;
import java.util.List;

/**
 * Clue as used in word games. For example, "an ... a day keeps the doctor away".
 *
 * @author <a href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Clue implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * Answer of this clue
     */
    private Word word;

    /**
     * ISO language code
     */
    private String languageCode;

    /**
     * True if the answer is only part of the original word.
     * This flag is part of the clue rather than word because
     * some words are parts of other words and only "user" (e.g. clue) knows what it is.
     * For example: clue, clueless. A clue could be for "clue" as word part could be "a ...less person".
     */
    private Boolean wordPart;

    /**
     * The text of the clue
     */
    private String content;

    /**
     * Clue difficulty level: from 1 = very easy to 5 = very hard
     */
    private Integer difficulty;

    private ClueTemplate clueTemplate;

    @JsonManagedReference("clue-attribute")
    private List<ClueEntityAttribute> clueEntityAttributes;

    /**
     * True if the answer is a concatenation of multi word value.
     * This flag is part of the clue rather than word because
     * some multiwords might be words and only "user" (e.g. clue) knows what it is.
     */
    private Boolean multiword;

    /**
     * The url of the image for media clues
     */
    private String imgUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Boolean getWordPart() {
        return wordPart;
    }

    public void setWordPart(Boolean wordPart) {
        this.wordPart = wordPart;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        if (null != difficulty && 0 < difficulty && difficulty <= 5) {
            this.difficulty = difficulty;
        } else {
            if (null != difficulty) {
                throw new IllegalClueDifficultyValueException(difficulty);
            } else {
                this.difficulty = null;
            }
        }
    }

    public ClueTemplate getClueTemplate() {
        return clueTemplate;
    }

    public void setClueTemplate(ClueTemplate clueTemplate) {
        this.clueTemplate = clueTemplate;
    }

    public List<ClueEntityAttribute> getClueEntityAttributes() {
        return clueEntityAttributes;
    }

    public void setClueEntityAttributes(List<ClueEntityAttribute> clueEntityAttributes) {
        this.clueEntityAttributes = clueEntityAttributes;
    }

    public Boolean getMultiword() {
        return multiword;
    }

    public void setMultiword(Boolean multiword) {
        this.multiword = multiword;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}