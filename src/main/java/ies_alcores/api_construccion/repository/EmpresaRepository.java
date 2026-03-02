package ies_alcores.api_construccion.repository;

import ies_alcores.api_construccion.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}