package pe.edu.idat.licoreria_continua2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.licoreria_continua2.model.bd.Producto;
import pe.edu.idat.licoreria_continua2.model.bd.Proveedor;
import pe.edu.idat.licoreria_continua2.repository.ProductoRepository;
import pe.edu.idat.licoreria_continua2.repository.ProveedorRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ProveedorService implements IProveedorService{
    private ProveedorRepository proveedorRepository;
    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor guardarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor obtenerProveedor(Integer id) {
        return proveedorRepository.findById(id).orElse(null);
    }


}
