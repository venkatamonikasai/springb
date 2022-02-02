package com.dxc.learning.libraryrestapp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name ="books")

public class Book {

    @Id
    private Integer id;

    private String title;

    private String isbn;

    private LocalDate publicationDate;
    
}