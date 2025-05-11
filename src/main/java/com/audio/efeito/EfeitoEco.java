package com.audio.efeito;

import com.audio.dispositivo.DispositivoAudio;

public class EfeitoEco extends EfeitoAudio {
    public EfeitoEco(DispositivoAudio dispositivo) {
        super(dispositivo);
    }

    @Override
    public void reproduzirSom(String som) {
        super.reproduzirSom(som + " [com eco]");
    }
}

