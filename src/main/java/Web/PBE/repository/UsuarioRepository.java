package Web.PBE.repository;

import Web.PBE.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Meta;



import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    @Meta(comment = "Encontra entidades por nome")
    Usuario findFirstByNome(String nome);


    @Meta(comment = "Encontra entidades por nome começados com a string nome")
    List<Usuario> findByNomeStartingWith(String prefixo);
}
