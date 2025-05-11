package com.audio.efeito;

import com.audio.dispositivo.DispositivoAudio;

public abstract class EfeitoAudio implements DispositivoAudio {
    protected DispositivoAudio dispositivo;

    public EfeitoAudio(DispositivoAudio dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void reproduzirSom(String som) {
        dispositivo.reproduzirSom(som);
    }
}

