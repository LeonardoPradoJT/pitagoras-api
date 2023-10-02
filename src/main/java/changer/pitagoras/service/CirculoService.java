package changer.pitagoras.service;

import changer.pitagoras.model.Circulo;
import changer.pitagoras.repository.CirculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CirculoService {

    @Autowired
    private CirculoRepository circuloRepository;

    public List<Circulo> listarCirculos() {
        return circuloRepository.findAll();
    }
}
