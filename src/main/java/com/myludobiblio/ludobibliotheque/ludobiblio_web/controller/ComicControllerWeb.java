package com.myludobiblio.ludobibliotheque.ludobiblio_web.controller;

import com.myludobiblio.ludobibliotheque.ludobiblio_web.form.ComicForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ComicControllerWeb {

    @GetMapping("/create-form-book")
    public String displayCreateFormBook(@ModelAttribute ComicForm comicForm){
        System.out.println("La méthode displayCreateFormBook a été invoquée");
        return "comic-create-form";
    }
}
