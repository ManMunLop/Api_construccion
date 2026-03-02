package ies_alcores.api_construccion.repository;

import ies_alcores.api_construccion.model.Empresa;
import ies_alcores.api_construccion.model.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObraRepository extends JpaRepository<Obra, Long> {
}
