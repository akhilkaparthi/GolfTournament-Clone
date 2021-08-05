package com.golf.akhil.game.repository;

import com.golf.akhil.game.domain.entity.GolfTournamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GolfTournamentRepository extends JpaRepository<GolfTournamentEntity, Long> {
}
