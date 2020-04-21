delete from joueurs;
drop table joueurs;
CREATE TABLE Joueurs(
  joueur_Id SERIAL PRIMARY KEY,
  nom VARCHAR(16) NOT NULL,
  prenom VARCHAR(16) NOT NULL,
  commentaire VARCHAR(200) NOT NULL,
  date_Jeu Date,
  score BIGINT NOT NULL
);