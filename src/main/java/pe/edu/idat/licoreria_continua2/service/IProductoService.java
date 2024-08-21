package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Categoria;
import pe.edu.idat.licoreria_continua2.model.bd.Producto;
import pe.edu.idat.licoreria_continua2.model.dto.ProductoDto;

import java.util.List;

public interface IProductoService {

    List<ProductoDto> listarProductos();

    Producto guardarProducto(ProductoDto producto);

    Producto obtenerProducto(Integer idproducto);

}
