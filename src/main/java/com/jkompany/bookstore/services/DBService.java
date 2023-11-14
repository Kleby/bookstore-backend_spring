package com.jkompany.bookstore.services;

import com.jkompany.bookstore.models.Categoria;
import com.jkompany.bookstore.models.Livro;
import com.jkompany.bookstore.repository.CategoriaRepository;
import com.jkompany.bookstore.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;
    public void instanciarBD() {

        Categoria cat1 = new Categoria(null, "Informática", "Livros de T.I");
        Categoria cat2 = new Categoria(null, "Ficção Científica", "Livros para Jovens e Adultos com incrivei histórias de ficção científica");
        Categoria cat3 = new Categoria(null, "História", "História do Brasil");


        Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Criação de software com códigos limpos", cat1);
        Livro l2 = new Livro(null, "MIcro-serviços com spring", "Desconheço", "Aprena a criar aplicações com spring", cat1);
        Livro l3 = new Livro(null, "História de Pernambuco", "Fernando de Nassau", "Reformo Recife e trouxe avanços", cat3);
        Livro l4 = new Livro(null, "Star Trek", "Não COnheço", "Inspirado na série de tv Star trek", cat2);

        cat1.getLivros().addAll(Arrays.asList(l1,l2));
        cat2.getLivros().addAll(Arrays.asList(l4));
        cat3.getLivros().addAll(Arrays.asList(l3));

        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4));

    }
}