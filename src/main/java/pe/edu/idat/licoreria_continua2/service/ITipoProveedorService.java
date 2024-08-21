package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.TipoProveedor;

import java.util.List;

public interface ITipoProveedorService {

    List<TipoProveedor> listarTipoProveedor();

    TipoProveedor obtenerTipoProveedor(Integer id);
}
