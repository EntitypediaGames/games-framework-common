package org.entitypedia.games.gameframework.common.model;

import java.io.Serializable;

/**
 * Clue information.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class Clue implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Word word;

    private String languageCode;

    private Boolean wordPart;

    private String content;

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
}