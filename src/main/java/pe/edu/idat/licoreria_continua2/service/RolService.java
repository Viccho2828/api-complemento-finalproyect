package pe.edu.idat.licoreria_continua2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.licoreria_continua2.model.bd.Rol;
import pe.edu.idat.licoreria_continua2.repository.RolRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class RolService implements IRolService{
    private RolRepository rolRepository;
    @Override
    public List<Rol> listarRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol obtenerRol(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }
}
