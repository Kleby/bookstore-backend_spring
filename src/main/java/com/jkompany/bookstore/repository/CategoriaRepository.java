package com.jkompany.bookstore.repository;

import com.jkompany.bookstore.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
