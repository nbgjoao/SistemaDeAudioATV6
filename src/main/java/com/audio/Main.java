package com.audio;

import com.audio.dispositivo.AltoFalante;
import com.audio.dispositivo.DispositivoAudio;
import com.audio.dispositivo.FoneDeOuvido;
import com.audio.efeito.EfeitoAmplificacao;
import com.audio.efeito.EfeitoEco;
import com.audio.player.AudioPlayer;
import com.audio.player.PlayerSimples;

public class Main {
    public static void main(String[] args) {
        
        DispositivoAudio altoFalante = new AltoFalante();
        AudioPlayer playerSimples = new PlayerSimples(altoFalante);
        playerSimples.tocar("Som básico");

        DispositivoAudio altoFalanteComEco = new EfeitoEco(altoFalante);
        playerSimples = new PlayerSimples(altoFalanteComEco);
        playerSimples.tocar("Som com efeito");

        DispositivoAudio fonesComEfeitos = new EfeitoAmplificacao(new EfeitoEco(new FoneDeOuvido()));
        AudioPlayer playerAvancado = new PlayerSimples(fonesComEfeitos);
        playerAvancado.tocar("Som avançado");
    }
}
