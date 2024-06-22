package co.edu.uptc.eisc.Biblioteca.services;

import co.edu.uptc.eisc.Biblioteca.domains.MyBook;
import co.edu.uptc.eisc.Biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceBook {

    @Autowired
    private final BookRepository bookRepository;

    public ServiceBook(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<MyBook> searchOutstanding(){
        return bookRepository.searchAllBooks();
    }

    public List<MyBook> searchByEditorial(int editorialId){
        return bookRepository.searchByEditorial(editorialId);
    }

    public List<MyBook> search(String query){
        return bookRepository.search(query);
    }
}