import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioFilePlayer {

   boolean suspender;
   boolean pausar;

   public AudioFilePlayer(String str) {

      suspender = false;
      pausar = false;
      try {
         while(!Thread.currentThread().isInterrupted()){
         Clip sonido = AudioSystem.getClip();
         File a = new File(str);
         sonido.open(AudioSystem.getAudioInputStream(a));
         sonido.start();
         Thread.sleep(287000);
         sonido.close();
      }

      }
      catch (Exception tipoError) {
         System.out.println("¡Oh no, algo salió mal!" + tipoError);
      }
   }


}
