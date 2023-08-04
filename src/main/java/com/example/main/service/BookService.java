package com.example.main.service;

import com.example.main.entity.BookEntity;
import com.example.main.model.BookRequestModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {
    //Book Creation Implementation
    ResponseEntity<Object> create (BookRequestModel bookRequestModel);
    ResponseEntity<Object> update (Long bookID, BookRequestModel updatedBookModel);
    void delete (Long bookID);

    List<BookEntity> getAllBooks ();

    BookEntity getBookByID(Long bookID);

    List<BookEntity> getBookByAuthorNameAndBookName(String authorName, String bookName);

    List<BookEntity> getBookByAuthorName(String authorName);
}
