package ies_alcores.api_construccion.service;

import ies_alcores.api_construccion.model.Empresa;
import ies_alcores.api_construccion.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> findAll() {
        return this.empresaRepository.findAll(); }

    public  Empresa findById(final Long id) {
        return this.empresaRepository.findById(id).get();}
}