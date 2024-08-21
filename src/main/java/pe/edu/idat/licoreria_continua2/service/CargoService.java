package pe.edu.idat.licoreria_continua2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.repository.CargoRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class CargoService implements ICargoService {
    private CargoRepository cargoRepository;
    @Override
    public List<Cargo> listarCargos() {
        return cargoRepository.findAll();
    }

    @Override
    public Cargo obtenerCargo(Integer id) {
        return cargoRepository.findById(id).orElse(null);
    }
}
