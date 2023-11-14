package com.jkompany.bookstore;

import com.jkompany.bookstore.models.Categoria;
import com.jkompany.bookstore.models.Livro;
import com.jkompany.bookstore.repository.CategoriaRepository;
import com.jkompany.bookstore.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}




}
