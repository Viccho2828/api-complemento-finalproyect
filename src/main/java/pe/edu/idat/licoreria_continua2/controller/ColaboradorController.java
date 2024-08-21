package pe.edu.idat.licoreria_continua2.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.Colaborador;
import pe.edu.idat.licoreria_continua2.service.IColaboradorService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/colaborador")
public class ColaboradorController {

    private IColaboradorService iColaboradorService;
    @GetMapping("/listar")
    @ResponseBody
    public List<Colaborador> listarColaboradores(){
        return iColaboradorService.listarColaborador();

    }

    @GetMapping("/{id}")
    @ResponseBody
    public Colaborador obtenerColaborador(@PathVariable("id") Integer id){
        return iColaboradorService.obtenerColaborador(id);
    }
}
