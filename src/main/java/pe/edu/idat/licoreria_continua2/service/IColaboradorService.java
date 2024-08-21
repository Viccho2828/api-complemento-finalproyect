package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.Colaborador;

import java.util.List;

public interface IColaboradorService {
    List<Colaborador> listarColaborador();

    Colaborador obtenerColaborador(Integer id);

}
