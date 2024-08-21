package pe.edu.idat.licoreria_continua2.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.licoreria_continua2.model.bd.TipoProveedor;
import pe.edu.idat.licoreria_continua2.model.bd.Usuario;
import pe.edu.idat.licoreria_continua2.service.IUsuarioService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {
    private IUsuarioService iUsuarioService;
    @GetMapping("/listar")
    @ResponseBody
    public List<Usuario> listarUsuarios(){
        return iUsuarioService.listarUsuarios();

    }

    @GetMapping("/{id}")
    @ResponseBody
    public Usuario obtenerUsuario(@PathVariable("id") Integer id){
        return iUsuarioService.obtenerUsuario(id);
    }


}
