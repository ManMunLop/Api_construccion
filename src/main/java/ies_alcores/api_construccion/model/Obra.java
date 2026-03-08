package ies_alcores.api_construccion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Obra {

    @Id
    private long id;
    private String Ubicacion;
    private int plantel;
    private Date fecha_inicio;
    private BigDecimal presupuesto;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
}
