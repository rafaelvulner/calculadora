package com.calculadora.service;

import com.calculadora.dtos.CalculadoraRequest;
import com.calculadora.dtos.CalculadoraResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public CalculadoraResponseDTO somar(CalculadoraRequest request) {
        return CalculadoraResponseDTO.builder().resultado(request.getValor1() + request.getValor2()).build();
    }

    public CalculadoraResponseDTO multiplicar(CalculadoraRequest request) {
        return CalculadoraResponseDTO.builder().resultado(request.getValor1() * request.getValor2()).build();
    }

    public CalculadoraResponseDTO subtrair(CalculadoraRequest request) {
        return CalculadoraResponseDTO.builder().resultado(request.getValor1() - request.getValor2()).build();
    }

    public CalculadoraResponseDTO dividir(CalculadoraRequest request) {
        return CalculadoraResponseDTO.builder().resultado(request.getValor1() / request.getValor2()).build();
    }


}

