package com.confinement.online.score.com.confinement.online.score.controller;

import com.confinement.online.score.com.confinement.online.score.entiy.Joueurs;
import com.confinement.online.score.com.confinement.online.score.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/confines/liveScore")
public class JoueurController {


    private final JoueurService joueurService;
            ;
    @Autowired
    public JoueurController(JoueurService joueurService) {
        this.joueurService = joueurService;
    }

    @RequestMapping(path = "/score", method = RequestMethod.GET)
    public List<Joueurs> getPlayers(){
        List<Joueurs> listJoueur= new ArrayList();

        listJoueur=joueurService.getJoueurs();

                if(listJoueur.isEmpty()) return null; else return listJoueur;
    }

    @RequestMapping(path = "/score/{id}", method = RequestMethod.GET)
    public ResponseEntity<Joueurs> getPlayersById(@PathVariable Long id){
       Optional<Joueurs> joueur= joueurService.getJoueurById(id);
        return (joueur.isPresent()) ?
                new ResponseEntity<>(joueur.get(), HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @RequestMapping(path = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<Joueurs> deleteJoueur(@RequestBody Joueurs user) {
        joueurService.deleteJoueur(user.getJoueurId());
        return new ResponseEntity<>(new Joueurs(), HttpStatus.OK);
    }

    @RequestMapping(path = "/update", method = RequestMethod.PATCH)
    public ResponseEntity<Joueurs> majJoueur(@RequestBody Joueurs user) {
        joueurService.updateJoueur(user);
        return new ResponseEntity<>(new Joueurs(), HttpStatus.OK);
    }


    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public ResponseEntity<Joueurs> saveJoueur(@RequestBody Joueurs user) {
        joueurService.saveJoueur(user);
        return new ResponseEntity<>(new Joueurs(), HttpStatus.OK);
    }


}
