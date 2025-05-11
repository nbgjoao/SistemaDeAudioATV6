package com.audio.player;

import com.audio.dispositivo.DispositivoAudio;

public abstract class AudioPlayer {
    protected DispositivoAudio dispositivo;

    public AudioPlayer(DispositivoAudio dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void tocar(String som);
}
