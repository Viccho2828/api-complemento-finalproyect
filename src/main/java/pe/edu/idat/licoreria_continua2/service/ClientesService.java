package pe.edu.idat.licoreria_continua2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.licoreria_continua2.model.bd.Clientes;
import pe.edu.idat.licoreria_continua2.repository.ClientesRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientesService implements IClientesService{
    private ClientesRepository clientesRepository;
    @Override
    public List<Clientes> listarClientes() {
        return clientesRepository.findAll();
    }

    @Override
    public Clientes obtenerClientes(Integer id) {
        return clientesRepository.findById(id).orElse(null);
    }
}
