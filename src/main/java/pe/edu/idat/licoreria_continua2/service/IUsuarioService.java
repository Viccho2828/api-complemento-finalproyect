package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Rol;
import pe.edu.idat.licoreria_continua2.model.bd.Usuario;

import java.util.List;

public interface IUsuarioService {
    List<Usuario> listarUsuarios();

    Usuario obtenerUsuario(Integer id);
}
