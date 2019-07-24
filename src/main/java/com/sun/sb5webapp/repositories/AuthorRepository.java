package com.sun.sb5webapp.repositories;

import com.sun.sb5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
