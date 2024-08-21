package pe.edu.idat.licoreria_continua2.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.Categoria;
import pe.edu.idat.licoreria_continua2.service.ICargoService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/cargo")
public class CargoController {
    private ICargoService iCargoService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Cargo> listarCargos(){
        return iCargoService.listarCargos();

    }

    @GetMapping("/{id}")
    @ResponseBody
    public Cargo obtenerCargo(@PathVariable("id") Integer id){
        return iCargoService.obtenerCargo(id);
    }
}
