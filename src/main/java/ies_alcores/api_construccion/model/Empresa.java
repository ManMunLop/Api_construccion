package ies_alcores.api_construccion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Empresa {
    @Id
    private long id;
    private String CIF;
    private String nombre;
    private int grupos;
    private int trabajadores;


}
