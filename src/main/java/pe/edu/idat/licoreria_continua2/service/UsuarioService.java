package pe.edu.idat.licoreria_continua2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.licoreria_continua2.model.bd.Usuario;
import pe.edu.idat.licoreria_continua2.repository.UsuarioRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class UsuarioService implements IUsuarioService{
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario obtenerUsuario(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
