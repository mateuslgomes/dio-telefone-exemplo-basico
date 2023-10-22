package org.example;

import org.example.interfaces.AparelhoTelefonico;
import org.example.interfaces.NavegadorInternet;
import org.example.interfaces.ReprodutorMusical;

public class Dispositivo implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausa");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

}
