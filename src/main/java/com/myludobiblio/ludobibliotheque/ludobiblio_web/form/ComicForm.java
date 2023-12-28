package com.myludobiblio.ludobibliotheque.ludobiblio_web.form;

import javax.validation.constraints.NotBlank;

public class ComicForm {
    private Long id;

    @NotBlank
    private String title;

    private int tome;

    private String subtitle;

    @NotBlank
    private Long idAuthor;

    private Long idIllustrator;

    @NotBlank
    private Long idEditor;

    @NotBlank
    private int publicationYear;

    @NotBlank
    private Long ageMin;

    private String style;

    private String pathImage;

    private String resume;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTome() {
        return tome;
    }

    public void setTome(int tome) {
        this.tome = tome;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    public Long getIdIllustrator() {
        return idIllustrator;
    }

    public void setIdIllustrator(Long idIllustrator) {
        this.idIllustrator = idIllustrator;
    }

    public Long getIdEditor() {
        return idEditor;
    }

    public void setIdEditor(Long idEditor) {
        this.idEditor = idEditor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Long getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Long ageMin) {
        this.ageMin = ageMin;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
