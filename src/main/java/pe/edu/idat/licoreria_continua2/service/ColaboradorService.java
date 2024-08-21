package pe.edu.idat.licoreria_continua2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.licoreria_continua2.model.bd.Colaborador;
import pe.edu.idat.licoreria_continua2.repository.ColaboradorRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ColaboradorService implements IColaboradorService{
    private ColaboradorRepository colaboradorRepository;
    @Override
    public List<Colaborador> listarColaborador() {
        return colaboradorRepository.findAll();
    }

    @Override
    public Colaborador obtenerColaborador(Integer id) {
        return colaboradorRepository.findById(id).orElse(null);
    }
}
