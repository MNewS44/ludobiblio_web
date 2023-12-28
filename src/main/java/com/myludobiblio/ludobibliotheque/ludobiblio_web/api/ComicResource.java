package com.myludobiblio.ludobibliotheque.ludobiblio_web.api;

import com.myludobiblio.ludobibliotheque.core.entity.book.Comic;
import com.myludobiblio.ludobibliotheque.core.service.BiblioServiceInterface;
import com.myludobiblio.ludobibliotheque.ludobiblio_web.form.ComicForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comic")
public class ComicResource {

    @Autowired
    private BiblioServiceInterface biblioService;

    @GetMapping
    public List<Comic> displayHome(){
        System.out.println("Méthode displayHome de Comic invoquée");

        return biblioService.getAllComics();
    }

    @GetMapping("/{id}")
    public Comic get(@PathVariable("id") Long id) {
        System.out.println("La méthode get a été invoquée pour l'id " + id);
        return biblioService.getComicById(id);
    }

    @GetMapping("/create-form-book")
    public ModelAndView displayCreateFormBook(@Valid @ModelAttribute ComicForm comicForm, BindingResult results){
        System.out.println("La méthode displayCreateFormBook a été invoquée");
        ModelAndView mv = new ModelAndView("/comic-create-form");
        return mv;
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute ComicForm comicForm, BindingResult results){
        if (results.hasErrors()){
            System.out.println("Il y a des erreurs dans la saisie du formulaire");
            System.out.println(results.getFieldError());
            return "comic-create-form";
        }
        Comic comic = new Comic();
        comic.setTitle(comicForm.getTitle());

        biblioService.createComic(comic);

        return "comic-created";
    }

    /*@PostMapping
    public Comic create(@RequestBody Comic comic){
        return biblioService.createComic(comic);
    }*/

    public BiblioServiceInterface getBiblioService() {
        return biblioService;
    }

    public void setBiblioService(BiblioServiceInterface biblioService) {
        this.biblioService = biblioService;
    }
}
