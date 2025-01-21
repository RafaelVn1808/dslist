package com.example.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity //Configurar para que seja uma tabela do banco relacional.
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrementação do banco de dados.
    private long id;
    private String title;

    @Column(name = "game_year") //customizando o nome no banco de dados para não haver conflitos.
    private Integer year;
    private String genre;
    private String plataform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game() {
    }

    public Game(long id, String longDescription, String shortDescription, String imgUrl, String plataform,
                String genre, Integer year, String title) {

        this.id = id;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        this.imgUrl = imgUrl;
        this.plataform = plataform;
        this.genre = genre;
        this.year = year;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
