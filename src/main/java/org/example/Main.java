package org.example;

public class Main {

    public static void main(String[] args) {
        var dispositivo = new Dispositivo();

        // Usando o método ligar
        dispositivo.ligar();

        // Usando o método atender
        dispositivo.atender();

        // Usando o método iniciarCorreioVoz
        dispositivo.iniciarCorreioVoz();

        // Usando o método exibirPagina
        dispositivo.exibirPagina();

        // Usando o método adicionarNovaAba
        dispositivo.adicionarNovaAba();

        // Usando o método atualizarPagina
        dispositivo.atualizarPagina();

        // Usando o método tocar
        dispositivo.tocar();

        // Usando o método pausar
        dispositivo.pausar();

        // Usando o método selecionarMusica
        dispositivo.selecionarMusica();
    }

}
