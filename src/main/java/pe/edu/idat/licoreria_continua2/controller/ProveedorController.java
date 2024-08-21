package pe.edu.idat.licoreria_continua2.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.licoreria_continua2.model.bd.Clientes;
import pe.edu.idat.licoreria_continua2.model.bd.Proveedor;
import pe.edu.idat.licoreria_continua2.service.IProveedorService;

import java.util.List;

@Controller
@RequestMapping("/proveedor")
@AllArgsConstructor
public class ProveedorController {
    private IProveedorService iProveedorService;
    @GetMapping("/listar")
    @ResponseBody
    public List<Proveedor> listarProveedores(){
        return iProveedorService.listarProveedores();
    }


    @GetMapping("/{id}")
    @ResponseBody
    public Proveedor obtenerProveedores(@PathVariable("id") Integer id){
        return iProveedorService.obtenerProveedor(id);
    }
}
