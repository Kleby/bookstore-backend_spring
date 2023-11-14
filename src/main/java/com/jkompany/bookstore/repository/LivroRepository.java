package com.jkompany.bookstore.repository;

import com.jkompany.bookstore.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
