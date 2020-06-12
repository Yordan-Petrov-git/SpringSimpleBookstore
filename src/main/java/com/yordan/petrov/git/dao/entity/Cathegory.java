package com.yordan.petrov.git.dao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Cathegory extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;
    private Set<Book> books;

    public Cathegory() {
    }

    public Cathegory(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ManyToMany(mappedBy = "categories")
    public Set<Book> getBooks() {
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
