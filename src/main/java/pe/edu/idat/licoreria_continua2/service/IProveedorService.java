package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Categoria;
import pe.edu.idat.licoreria_continua2.model.bd.Producto;
import pe.edu.idat.licoreria_continua2.model.bd.Proveedor;

import java.util.List;

public interface IProveedorService {

    List<Proveedor> listarProveedores();

    Proveedor guardarProveedor(Proveedor proveedor);

    Proveedor obtenerProveedor(Integer id);
}
