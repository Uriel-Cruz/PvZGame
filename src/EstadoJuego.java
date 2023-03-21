/**
  * Interfaz para reprsentar los estados posibles de nuestro juego.  
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public interface EstadoJuego{

  /** 
    * Método usado para que el juego inicie.
    */
  public void start();

  /** 
    * Método usado para que el jugador compré dentro del juego.
    */
  public void comprar();

  /** 
    * Método usado para jugar.
    */
  public void jugar();

}
