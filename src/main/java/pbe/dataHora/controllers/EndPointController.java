package pbe.dataHora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pbe.dataHora.models.Usuario;
import pbe.dataHora.services.UsuarioService;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@RestController
public class EndPointController {

    @Autowired
    UsuarioService serv;

    @GetMapping("/busca/{nome}")
    List<Usuario> lista(@PathVariable String nome) {
        return serv.buscaTodosComNome(nome);
    }

    @GetMapping("/buscaNome/{nome}")
    Usuario listaPorNome(@PathVariable String nome) {
        return serv.buscaPorNome(nome);
    }


    @GetMapping("/criaUsuario/{nome}/{sobrenome}")
    public long criaUsuario(@PathVariable String nome, @PathVariable String sobrenome) {
        return serv.criaUsuario(nome, sobrenome);
    }

}
