package com.maryam.aalizadeh.jpadatasample.repository;

import com.maryam.aalizadeh.jpadatasample.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
