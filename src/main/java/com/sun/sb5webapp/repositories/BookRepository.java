package com.sun.sb5webapp.repositories;

import com.sun.sb5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
