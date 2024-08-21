package pe.edu.idat.licoreria_continua2.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.licoreria_continua2.model.bd.Categoria;
import pe.edu.idat.licoreria_continua2.model.bd.Proveedor;
import pe.edu.idat.licoreria_continua2.service.ICategoriaService;
import pe.edu.idat.licoreria_continua2.service.IProveedorService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/categoria")
public class CategoriaController {
    private ICategoriaService iCategoriaService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Categoria> listarCategorias(){
        return iCategoriaService.listarCategorias();

    }

    @GetMapping("/{id}")
    @ResponseBody
    public Categoria obtenerCategoria(@PathVariable("id") Integer id){
        return iCategoriaService.obtenerCategoria(id);
    }

}
