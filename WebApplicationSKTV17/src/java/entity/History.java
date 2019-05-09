/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author user
 */
@Entity
public class History implements Serializable {

  private static final long serialWersionUID= 1L;
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  @OneToOne
  private Reader reader;
  @OneToOne
  private Book book;
  @Temporal(javax.persistence.TemporalType.TIMESTAMP)
  private Date dateREturnBook;

    public History() {
    }

    public History(Reader reader, Book book, Date dateREturnBook) {
        this.reader = reader;
        this.book = book;
        this.dateREturnBook = dateREturnBook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDateREturnBook() {
        return dateREturnBook;
    }

    public void setDateREturnBook(Date dateREturnBook) {
        this.dateREturnBook = dateREturnBook;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.reader);
        hash = 97 * hash + Objects.hashCode(this.book);
        hash = 97 * hash + Objects.hashCode(this.dateREturnBook);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.reader, other.reader)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        if (!Objects.equals(this.dateREturnBook, other.dateREturnBook)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "History{" + "id=" + id + ", reader=" + reader + ", book=" + book + ", dateREturnBook=" + dateREturnBook + '}';
    }
 
  
}
  
 
