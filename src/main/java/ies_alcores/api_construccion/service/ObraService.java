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
        return this.obraRepository.findAll(); }
}
