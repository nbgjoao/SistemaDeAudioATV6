package com.audio.player;

import com.audio.dispositivo.DispositivoAudio;

public class PlayerSimples extends AudioPlayer {
    public PlayerSimples(DispositivoAudio dispositivo) {
        super(dispositivo);
    }

    @Override
    public void tocar(String som) {
        dispositivo.reproduzirSom(som);
    }
}
