package pe.edu.idat.licoreria_continua2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.licoreria_continua2.model.bd.TipoProveedor;
import pe.edu.idat.licoreria_continua2.repository.TipoProveedorRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class TipoProveedorService implements ITipoProveedorService{

    private TipoProveedorRepository tipoProveedorRepository;
    @Override
    public List<TipoProveedor> listarTipoProveedor() {
        return tipoProveedorRepository.findAll();
    }

    @Override
    public TipoProveedor obtenerTipoProveedor(Integer id) {
        return tipoProveedorRepository.findById(id).orElse(null);
    }
}
