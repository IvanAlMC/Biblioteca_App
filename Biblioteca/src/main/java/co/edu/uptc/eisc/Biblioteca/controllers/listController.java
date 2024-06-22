package co.edu.uptc.eisc.Biblioteca.controllers;

import co.edu.uptc.eisc.Biblioteca.domains.MyBook;
import co.edu.uptc.eisc.Biblioteca.services.ServiceBook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class listController {

    private final ServiceBook serviceBook;

    public listController(ServiceBook serviceBook){
        this.serviceBook = serviceBook;
    }

    @RequestMapping("/")
    public String listBooks(Model model){
        List<MyBook> books = serviceBook.searchOutstanding();
        model.addAttribute("myBooks", books);
        return "list";
    }

    @RequestMapping("/bookByEditorial")
    public String listBooksByEditorial(int editorialId, Model model){
        List<MyBook> books = serviceBook.searchByEditorial(editorialId);
        model.addAttribute("myBooks", books);
        return "list";
    }

    @RequestMapping("/search")
    public String search(String query, Model model){
        List<MyBook> books = serviceBook.search(query);
        model.addAttribute("myBooks", books);
        return "list";
    }
}
