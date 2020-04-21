CREATE TABLE Joueurs(
  joueurId SERIAL PRIMARY KEY,
  nom VARCHAR(16) NOT NULL,
  prenom VARCHAR(16) NOT NULL,
  commentaire VARCHAR(200) NOT NULL,
  dateJeu Date,
  score BIGINT NOT NULL
);