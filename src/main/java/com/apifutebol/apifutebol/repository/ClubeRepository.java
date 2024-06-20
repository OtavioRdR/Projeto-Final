package com.apifutebol.apifutebol.repository;

import com.apifutebol.apifutebol.model.Clube;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClubeRepository extends JpaRepository<Clube, Long> {

    Optional<Clube> findByNomeAndEstado(String nome, String estado);
}
