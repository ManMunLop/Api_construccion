package ies_alcores.api_construccion.service;

import ies_alcores.api_construccion.model.Obra;
import ies_alcores.api_construccion.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObraService {

    @Autowired
    private ObraRepository obraRepository;

    public List<Obra> findAll() {
        return this.obraRepository.findAllObras();
    }

    public Obra findById(Long id) {
        return this.obraRepository.findObraById(id);
    }

    public List<Obra> findByEmpresa(Long empresaId) {
        return this.obraRepository.findObrasByEmpresa(empresaId);
    }

    public Obra save(Obra obra) {
        return this.obraRepository.save(obra);
    }

    public void delete(Long id) {
        this.obraRepository.deleteById(id);
    }
}