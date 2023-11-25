package changer.pitagoras.repository;

import changer.pitagoras.dto.ArquivoApenasBytesDto;
import changer.pitagoras.dto.HistoricoDto;
import changer.pitagoras.model.HistoricoConversao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface HistoricoConversaoRepository extends JpaRepository<HistoricoConversao, UUID> {
    List<HistoricoConversao> findByUsuarioId(UUID usuarioId);

    HistoricoConversao save(HistoricoConversao dto);

    @Query("select new changer.pitagoras.dto.ArquivoApenasBytesDto(idConversao, bytesArquivo) from HistoricoConversao where idConversao = ?1")
    ArquivoApenasBytesDto findBytesArquivoAndIdConversaoByIdConversao(UUID idArquivo);
}