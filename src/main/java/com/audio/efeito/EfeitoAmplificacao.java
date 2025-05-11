ppackage com.audio.efeito;

import com.audio.dispositivo.DispositivoAudio;

public class EfeitoAmplificacao extends EfeitoAudio {
    public EfeitoAmplificacao(DispositivoAudio dispositivo) {
        super(dispositivo);
    }

    @Override
    public void reproduzirSom(String som) {
        super.reproduzirSom(som.toUpperCase() + " [amplificado]");
    }
}

