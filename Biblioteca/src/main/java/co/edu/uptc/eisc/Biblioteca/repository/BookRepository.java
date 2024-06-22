package co.edu.uptc.eisc.Biblioteca.repository;

import co.edu.uptc.eisc.Biblioteca.domains.MyBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<MyBook, Integer> {

    @Query("from MyBook v order by v.name")
    List<MyBook> searchAllBooks();

    @Query("from MyBook v where v.editorial.id = ?1 order by v.name")
    List<MyBook> searchByEditorial(int editorialId);

    @Query("from MyBook l where l.name like %?1%")
    List<MyBook> search(String query);
}