package com.confinement.online.score.com.confinement.online.score.repository;

import com.confinement.online.score.com.confinement.online.score.entiy.Joueurs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoueursRepository  extends CrudRepository<Joueurs,Long> {
}
