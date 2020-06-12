package com.yordan.petrov.git.dao.repositories;

import com.yordan.petrov.git.dao.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {



}
