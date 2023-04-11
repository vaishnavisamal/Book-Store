package com.bookStore.bookStoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.bookStoreProject.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
