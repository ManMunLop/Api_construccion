package ies_alcores.api_construccion.repository;

import ies_alcores.api_construccion.model.Obra;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ObraRepository extends JpaRepository<Obra, Long> {

    @Query("SELECT o FROM Obra o")
    List<Obra> findAllObras();

    @Query("SELECT o FROM Obra o WHERE o.id = :id")
    Obra findObraById(@Param("id") Long id);

    @Query("SELECT o FROM Obra o WHERE o.empresa.id = :empresaId")
    List<Obra> findObrasByEmpresa(@Param("empresaId") Long empresaId);

}
