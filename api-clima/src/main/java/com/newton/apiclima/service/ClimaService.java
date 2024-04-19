package com.newton.apiclima.service;

import org.springframework.stereotype.Service;

@Service
public class ClimaService {

    public void salvarPrevisaoTempo(String cidade, String estado, String pais, String dia, String clima, int temperatura, int velocidadeVento, String direcaoVento, int umidade, int pressao) {
        // Lógica para salvar os dados no banco de dados
        // Aqui você pode utilizar um repositório JPA ou uma camada de acesso a dados para persistir os dados no banco de dados
        System.out.println("Dados de previsão do tempo salvos no banco de dados:");
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("País: " + pais);
        System.out.println("Dia: " + dia);
        System.out.println("Clima: " + clima);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Velocidade do Vento: " + velocidadeVento);
        System.out.println("Direção do Vento: " + direcaoVento);
        System.out.println("Umidade: " + umidade);
        System.out.println("Pressão: " + pressao);
    }
}