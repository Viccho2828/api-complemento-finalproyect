package pe.edu.idat.licoreria_continua2.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.licoreria_continua2.model.bd.Cargo;
import pe.edu.idat.licoreria_continua2.model.bd.TipoProveedor;
import pe.edu.idat.licoreria_continua2.service.ITipoProveedorService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/tipoproveedor")
public class TipoProveedorController {

    private ITipoProveedorService iTipoProveedorService;

    @GetMapping("/listar")
    @ResponseBody
    public List<TipoProveedor> listarTipoProveedor(){
        return iTipoProveedorService.listarTipoProveedor();

    }

    @GetMapping("/{id}")
    @ResponseBody
    public TipoProveedor obtenerTipoProveedor(@PathVariable("id") Integer id){
        return iTipoProveedorService.obtenerTipoProveedor(id);
    }

}
