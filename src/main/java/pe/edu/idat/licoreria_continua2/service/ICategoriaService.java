package pe.edu.idat.licoreria_continua2.service;

import pe.edu.idat.licoreria_continua2.model.bd.Categoria;

import java.util.List;

public interface ICategoriaService {

    List<Categoria> listarCategorias();

    Categoria guardarCategoria(Categoria categoria);

    Categoria obtenerCategoria(Integer id);

}
