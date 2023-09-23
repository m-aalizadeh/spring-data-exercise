package com.maryam.aalizadeh.jpadatasample.repository;

import com.maryam.aalizadeh.jpadatasample.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
