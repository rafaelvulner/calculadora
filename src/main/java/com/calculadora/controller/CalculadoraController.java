package com.calculadora.controller;

import com.calculadora.dtos.CalculadoraRequest;
import com.calculadora.dtos.CalculadoraResponseDTO;
import com.calculadora.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @GetMapping("/somar")
    public ResponseEntity<CalculadoraResponseDTO> somar(CalculadoraRequest request) {
        return ResponseEntity.ok(service.somar(request));
    }

    @GetMapping("/multiplicar")
    public ResponseEntity<CalculadoraResponseDTO> multiplicar(CalculadoraRequest request) {
        return ResponseEntity.ok(service.multiplicar(request));
    }

    @GetMapping ("/subtrair")
    public ResponseEntity<CalculadoraResponseDTO> subtrair(CalculadoraRequest request) {
        return ResponseEntity.ok(service.subtrair(request));
    }

    @GetMapping ("/dividir")
    public ResponseEntity<CalculadoraResponseDTO> dividir(CalculadoraRequest request) {
        return ResponseEntity.ok(service.dividir(request));
    }
}
