package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.Categoria;

import java.util.List;

public interface ICargoService {

    List<Cargo> listarCargos();

    Cargo obtenerCargo(Integer id);
}
