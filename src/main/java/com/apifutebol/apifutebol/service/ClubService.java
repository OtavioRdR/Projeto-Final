package com.apifutebol.apifutebol.service;

import com.apifutebol.apifutebol.model.Clube;
import com.apifutebol.apifutebol.repository.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClubService {

    @Autowired
    private ClubeRepository clubeRepository;

    public Clube criarClube(@org.jetbrains.annotations.NotNull Clube clube) {
        Optional<Clube> clubeExistente = clubeRepository.findByNomeAndEstado(clube.getNome(), clube.getEstado());
        if (clubeExistente.isPresent()) {
            throw new DataIntegrityViolationException("Clube já existe no estado especificado");
        }
        return clubeRepository.save(clube);
    }

    public Clube editarClube(Long id, Clube clube) {
        Clube clubeExistente = clubeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("O Clube não foi encontrado"));
        clubeExistente.setNome(clube.getNome());
        clubeExistente.setEstado(clube.getEstado());
        clubeExistente.setDataCriacao(clube.getDataCriacao());
        clubeExistente.setAtivo(clube.isAtivo());
        return clubeRepository.save(clubeExistente);
    }

    public void inativarClube(Long id) {
        Clube clubeExistente = clubeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("O Clube não foi encontrado"));
        clubeExistente.setAtivo(false);
        clubeRepository.save(clubeExistente);
    }

    public Clube buscarClube(Long id) {
        return clubeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("O Clube não foi encontrado"));
    }

    public List<Clube> listarClubes() {
        return clubeRepository.findAll();
    }
}
