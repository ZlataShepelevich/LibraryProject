package org.libraryproject.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

public class Book {
    private int book_id;

    @NotEmpty(message = "Название не должно быть пустым")
    @Size(min=2, max=30, message = "Название должно содержать от 2 до 30 символов")
    private String title;

    @Pattern(regexp = "[А-Я][а-я]+ [А-Я][а-я]+", message = "Имя автора должно быть в таком формате: Фамилия Имя")
    private String author;

    @Min(value = 0, message = "Год издания должен быть больше 0")
    private int year;

    ///////////
    private int person_id;

    public Book(){}

    public Book(int id, int person_id, String title, String author, int birthYear) {
        this.book_id = id;
        this.person_id = person_id;
        this.title = title;
        this.author = author;
        this.year = birthYear;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int id) {
        this.book_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
}

