package changer.pitagoras.controller;

import changer.pitagoras.model.Circulo;
import changer.pitagoras.model.Usuario;
import changer.pitagoras.service.CirculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/circulo")
public class CirculoController {

    @Autowired
    private CirculoService circuloService;

    public CirculoController() {
    }

    @GetMapping("/")
    public ResponseEntity<List<Circulo>> listarCirculos() {
        List<Circulo> lista = circuloService.listarCirculos();

        if (lista.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(lista);
    }
}
