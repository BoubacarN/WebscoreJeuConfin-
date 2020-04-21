package com.confinement.online.score.com.confinement.online.score.entiy;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="Joueurs")
public class Joueurs {
    @Id
    @Column(name="joueurId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int joueurId;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="commentaire")
   private String commentaire;
    @Column(name="dateJeu")
    private Date dateJeu;
    @Column(name="score")
   private int score;


    public Joueurs() {

    }

    public Joueurs(int joueurId, String nom, String prenom, String commentaire, Date dateJeu, int score) {
        this.joueurId = joueurId;
        this.nom = nom;
        this.prenom = prenom;
        this.commentaire = commentaire;
        this.dateJeu = dateJeu;
        this.score = score;
    }

    public int getJoueurId() {
        return joueurId;
    }

    public void setJoueurId(int joueurId) {
        this.joueurId = joueurId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateJeu() {
        return dateJeu;
    }

    public void setDateJeu(Date dateJeu) {
        this.dateJeu = dateJeu;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
