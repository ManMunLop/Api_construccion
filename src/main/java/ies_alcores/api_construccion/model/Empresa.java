package ies_alcores.api_construccion.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Empresa {
    @Id
    private long id;
    private String CIF;
    private String nombre;
    private int grupos;
    private int trabajadores;


    @OneToMany(mappedBy = "empresa")
    @JsonIgnore
    private List<Obra> obras; //
}
