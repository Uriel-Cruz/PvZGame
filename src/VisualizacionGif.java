import java.io.IOException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Clase para mostrar un Gif cuando un Zombie o el Jugador gane la partida.
 * 
 * @author Alejandro Blancas Peralta.
 */
public class VisualizacionGif {

    Thread music_thread;
    
    public void VisualizacionGifZ(){

        music_thread = new Thread(new PlayAudio("zombies-win.wav"));
        music_thread.start();
        Icon iconGif = new ImageIcon("ZombiesWin.gif");
        JLabel animacionGif = new JLabel(iconGif);
        
        JFrame ventana = new JFrame("Visualizando GIF");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().add(animacionGif);
        ventana.setSize(400, 400);
        
        ventana.setVisible(true);
    }


    public void VisualizacionGifP(){

        music_thread = new Thread(new PlayAudio("plants-win.wav"));
        music_thread.start();
        Icon iconGif = new ImageIcon("PlantasWin.gif");
        JLabel animacionGif = new JLabel(iconGif);
        
        JFrame ventana = new JFrame("Visualizando GIF");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().add(animacionGif);
        ventana.setSize(400, 400);
        
        ventana.setVisible(true);
    }
    
}