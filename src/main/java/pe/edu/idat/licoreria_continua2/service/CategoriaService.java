package pe.edu.idat.licoreria_continua2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.licoreria_continua2.model.bd.Categoria;
import pe.edu.idat.licoreria_continua2.repository.CategoriaRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService implements ICategoriaService{

    private CategoriaRepository categoriaRepository;
    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria obtenerCategoria(Integer id) {
        return categoriaRepository.findById(id).orElse(null);
    }


}
