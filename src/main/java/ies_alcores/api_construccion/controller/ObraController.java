package ies_alcores.api_construccion.controller;

import ies_alcores.api_construccion.model.Obra;
import ies_alcores.api_construccion.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/construccion")
public class ObraController {

    @Autowired
    private ObraService obraService;

    @GetMapping("")
    public ResponseEntity<List<Obra>> findAll() {
        return ResponseEntity.ok(this.obraService.findAll());
    }

}