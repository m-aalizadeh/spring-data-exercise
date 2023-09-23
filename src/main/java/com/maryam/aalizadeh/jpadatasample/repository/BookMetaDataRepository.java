package com.maryam.aalizadeh.jpadatasample.repository;

import com.maryam.aalizadeh.jpadatasample.model.BookMetaData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMetaDataRepository extends CrudRepository<BookMetaData, Long> {
}
