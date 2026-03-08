package ies_alcores.api_construccion.controller;

import ies_alcores.api_construccion.model.Obra;
import ies_alcores.api_construccion.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/construccion")
public class ObraController {

    @Autowired
    private ObraService obraService;

    // Consulta todas
    @GetMapping("")
    public ResponseEntity<List<Obra>> findAll() {
        return ResponseEntity.ok(this.obraService.findAll());
    }

    // Consulta por id
    @GetMapping("/{id}")
    public ResponseEntity<Obra> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.obraService.findById(id));
    }

    // Consulta por empresa
    @GetMapping("/empresa/{idEmpresa}")
    public ResponseEntity<List<Obra>> findByEmpresa(@PathVariable Long idEmpresa) {
        return ResponseEntity.ok(this.obraService.findByEmpresa(idEmpresa));
    }

    // Insert
    @PostMapping("")
    public ResponseEntity<Obra> save(@RequestBody Obra obra) {
        return ResponseEntity.ok(this.obraService.save(obra));
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        this.obraService.delete(id);
        return ResponseEntity.ok("Obra eliminada");
    }
}