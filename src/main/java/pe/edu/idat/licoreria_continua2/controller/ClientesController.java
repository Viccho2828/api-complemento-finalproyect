package pe.edu.idat.licoreria_continua2.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.Clientes;
import pe.edu.idat.licoreria_continua2.service.IClientesService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/clientes")
public class ClientesController {

    private IClientesService iClientesService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Clientes> listarClientes(){
        return iClientesService.listarClientes();

    }

    @GetMapping("/{id}")
    @ResponseBody
    public Clientes obtenerClientes(@PathVariable("id") Integer id){
        return iClientesService.obtenerClientes(id);
    }
}
