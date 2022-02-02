package com.dxc.learning.libraryrestapp.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dxc.learning.libraryrestapp.model.Author;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class Authorcontroller {
    private static List<Author> authors = new ArrayList();

    @GetMapping("/authors/{id}")
    public ResponseEntity<List<Author>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(authors);

    }

    @PostMapping({ "", "/" })
    public ResponseEntity<Author> create(@RequestBody Author author) {

        author.setCreatioDate(LocalDate.now());
        authors.add(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(author);
    }

}