package changer.pitagoras.repository;

import changer.pitagoras.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    @Query("SELECT u FROM Usuario AS u WHERE u.email = :email AND u.senha = :senha")
    List<Usuario> login(@Param("email") String email, @Param("senha") String senha);

    @Modifying
    @Query("UPDATE Usuario u SET u.senha = :novaSenha WHERE u.id = :uuid")
    void updateSenha(@Param("novaSenha") String novaSenha, @Param("uuid") UUID uuid);
}