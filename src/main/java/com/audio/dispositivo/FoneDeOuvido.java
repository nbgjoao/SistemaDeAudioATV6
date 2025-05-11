package com.audio.dispositivo;

public class FoneDeOuvido implements DispositivoAudio {
    @Override
    public void reproduzirSom(String som) {
        System.out.println("Reproduzindo som nos fones de ouvido: " + som);
    }
}
