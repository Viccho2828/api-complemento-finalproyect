package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.Clientes;

import java.util.List;

public interface IClientesService {
    List<Clientes> listarClientes();

    Clientes obtenerClientes(Integer id);


}
