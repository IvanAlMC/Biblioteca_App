package co.edu.uptc.eisc.Biblioteca.services;

import co.edu.uptc.eisc.Biblioteca.domains.Editorial;
import co.edu.uptc.eisc.Biblioteca.repository.EditorialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialService {

    private final EditorialRepository editorialRepository;

    public EditorialService(EditorialRepository editorialRepository){
        this.editorialRepository = editorialRepository;
    }

    public List<Editorial> searchAll(){
        return editorialRepository.findAll();
    }
}

