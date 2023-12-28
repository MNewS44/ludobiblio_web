package com.myludobiblio.ludobibliotheque.ludobiblio_web.api;

import com.myludobiblio.ludobibliotheque.core.entity.game.Game;
import com.myludobiblio.ludobibliotheque.core.service.LudoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/game")
public class GameResource {

    @Autowired
    private LudoServiceInterface ludoService;

    @GetMapping
    public List<Game> displayHome(){
        System.out.println("Méthode displayHome de Game invoquée");

        //return ludoService.getLudoRepository().findAll();

        return null;//ludoService.getLudoRepository().list();

        /*List<Game> games = new ArrayList<>();
        Game game1 = new Game(1L, "Trio", 1L, 1L, 1L, 2023, "Jeu d'apéro", 7L, 0L, "- de 30 min", 3L, 6L, "path", "Résumé");
        Game game2 = new Game(2L, "Akropolis", 2L, 2L, 2L, 2023, "Jeu de placement", 8L, 0L, "- de 30 min", 2L, 4L, "path", "Résumé");
        games.add(game1);
        games.add(game2);
        //biblioService.getBiblioRepository().getComics();

        return games;*/
    }

    @GetMapping("/{id}")
    public Game get(@PathVariable("id") Long id) {
        System.out.println("La méthode get a été invoquée pour l'id " + id);

        return null;//ludoService.getLudoRepository().getById(id);
    }

    public LudoServiceInterface getLudoService() {
        return ludoService;
    }

    public void setLudoService(LudoServiceInterface ludoService) {
        this.ludoService = ludoService;
    }
}
