package com.confinement.online.score.com.confinement.online.score.service;

import com.confinement.online.score.com.confinement.online.score.entiy.Joueurs;
import com.confinement.online.score.com.confinement.online.score.repository.JoueursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JoueurService {

    private final JoueursRepository joueursRepository;

    @Autowired
    public JoueurService(JoueursRepository joueursRepository) {
        this.joueursRepository = joueursRepository;
    }


    public List<Joueurs> getJoueurs(){
        Iterable<Joueurs> joueurs=this.joueursRepository.findAll();
        List<Joueurs> joeursMap = new ArrayList<Joueurs>();
        joueurs.forEach(j -> {
            Joueurs joueur = new Joueurs();
            joueur.setJoueurId(j.getJoueurId());
            joueur.setNom(j.getNom());
            joueur.setPrenom(j.getPrenom());
            joueur.setScore(j.getScore());
            joueur.setCommentaire(j.getCommentaire());
            joeursMap.add(joueur);
        });
    return joeursMap;}



    public Optional<Joueurs> getJoueurById(Long Id){
    Optional<Joueurs> guest = this.joueursRepository.findById(Id);
    if(guest!=null) return guest ;
    else return null;
}

    public void deleteJoueur(Long Id){
        Optional<Joueurs> guest = this.joueursRepository.findById(Id);
        if (guest!=null) this.joueursRepository.deleteById(Id);
    }

    public void saveJoueur(Joueurs guest){
        this.joueursRepository.save(guest);
    }

    public void updateJoueur(Joueurs guest){
        this.joueursRepository.save(guest);
    }
}
