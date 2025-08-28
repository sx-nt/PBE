package Web.PBE.controller;

import Web.PBE.model.Usuario;
import Web.PBE.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointController {

    @Autowired
    private UsuarioService serv;

    @GetMapping("/busca/usuario{nome}")
    public Usuario buscaUsuario(@PathVariable String nome) {
        return serv.buscaPorNome(nome);
    }

    @GetMapping("/criaUsuario/{nome}/{sobrenome}")
    public long criaUsuario(@PathVariable String nome, @PathVariable String sobrenome) {
        return serv.criaUsuario(nome, sobrenome);

    }
}
