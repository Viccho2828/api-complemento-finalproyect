package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.Rol;

import java.util.List;

public interface IRolService {
    List<Rol> listarRoles();

    Rol obtenerRol(Integer id);
}
