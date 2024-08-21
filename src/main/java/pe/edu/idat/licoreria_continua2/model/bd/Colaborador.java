package pe.edu.idat.licoreria_continua2.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "colaborador")
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codcolaborador;
    private String nombrecol;
    private String apellidocol;
    private String telefonocol;
    private String correocol;
    private String dnicol;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name="codcargo")
    private Cargo cargo;
}
