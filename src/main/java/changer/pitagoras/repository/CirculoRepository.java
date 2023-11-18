package changer.pitagoras.repository;

import changer.pitagoras.dto.CirculoSimplesDto;
import changer.pitagoras.model.Circulo;
import changer.pitagoras.model.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CirculoRepository extends JpaRepository<Circulo, UUID> {
    @Query(
            """
                SELECT c FROM Circulo as c WHERE c.id = :idCirc AND c.dono.id = :idDono
            """
    )
    Optional<Circulo> existe(@Param("idCirc") UUID idCirc, @Param("idDono") UUID idDono);

    @Modifying
    @Transactional
    @Query(
            """
                UPDATE Circulo AS c SET c.nomeCirculo = :novoNome WHERE c.id = :id
            """
    )
    int updateNome(@Param("novoNome") String novoNome, @Param("id") UUID id);

    List<CirculoSimplesDto> findAllByDono(Usuario dono);
}