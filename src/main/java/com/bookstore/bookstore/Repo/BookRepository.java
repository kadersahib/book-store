package com.bookstore.bookstore.Repo;

import com.bookstore.bookstore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
