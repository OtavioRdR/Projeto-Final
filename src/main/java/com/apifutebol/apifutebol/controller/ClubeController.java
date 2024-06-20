package com.apifutebol.apifutebol.controller;

import com.apifutebol.apifutebol.model.Clube;
import com.apifutebol.apifutebol.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubes")

public class ClubeController {

    @Autowired
    private ClubService clubService;

    @PostMapping
    public ResponseEntity<Clube> criarClube(@RequestBody Clube clube) {
        Clube novoClube = clubService.criarClube(clube);
        return new ResponseEntity<>(novoClube, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clube> editarClube(@PathVariable Long id, @RequestBody Clube clube) {
        Clube clubeEditado = clubService.editarClube(id, clube);
        return new ResponseEntity<>(clubeEditado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> inativarClube(@PathVariable Long id) {
        clubService.inativarClube(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clube> buscarClube(@PathVariable Long id) {
        Clube clube = clubService.buscarClube(id);
        return new ResponseEntity<>(clube, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Clube>> listarClubes() {
        List<Clube> clubes = clubService.listarClubes();
        return new ResponseEntity<>(clubes, HttpStatus.OK);
    }
}
