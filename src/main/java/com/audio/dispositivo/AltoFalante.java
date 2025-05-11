package com.audio.dispositivo;

public class AltoFalante implements DispositivoAudio {
    @Override
    public void reproduzirSom(String som) {
        System.out.println("Reproduzindo som no alto-falante: " + som);
    }
}
