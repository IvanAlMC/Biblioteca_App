package co.edu.uptc.eisc.Biblioteca.controllers;

import co.edu.uptc.eisc.Biblioteca.services.EditorialService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookCrudController {

    private final EditorialService editorialService;

    public BookCrudController(EditorialService editorialService){
        this.editorialService = editorialService;
    }

    @RequestMapping("/books/create")
    public String showFormAlta(Model model){
        model.addAttribute("editorials", editorialService.searchAll());
        return "formBook";
    }
}
