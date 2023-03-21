/**
  * Clase usada para nuestras Zombies y sus características.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Zombie{

  /* El ataque de nuestro Zombie. */
  int ataque;
  /* La defensa (salud) de nuestro Zombie. */
  int defensa;
  /* El nombre que tendrá nuestro Zombie. */
  String nombrefinal;
  private int fila, columna;
  private int referencia = 2;

  /**
    * Método constructor para nuestro Zombie.
    * @param ataque el nivel de ataque (Mordida) que tendrá el Zombie.
    * @param defensa el nivel de defensa (Salud) que tendrá el Zombie.
    * @param nombrefinal el nombre que tendrá nuestro Zombie.
    */
  public Zombie(int ataque, int defensa, String nombrefinal){
    this.ataque = ataque;
    this.defensa = defensa;
    this.nombrefinal = nombrefinal;
  }

  /**
    * Método para obtener el nombre de nuestro zombie.
    * @return nombre el nombre del zombie.
    */
  public String getNombre(){
    return this.nombrefinal;
  }

  /**
    * Método para obtener la fila de nuestro zombie.
    * @return fila la fila de nuestro zombie.
    */
  public int getFila(){
    return this.fila;
  }

  /**
    * Método para asinar la fila de nuestro zombie.
    * @param fila la fila en la que estará nuestro zombie
    */
  public void setFila(int fila){
    this.fila = fila;
  }

  /**
    * Método para obtener la columna de nuestro zombie.
    * @return columna la columna de nuestro zombie.
    */
  public int getColumna(){
    return this.columna;
  }

  /**
    * Método para asignar la columna de nuestro zombie.
    * @param columna la columna en la que estará nuestro zombie.
    */
  public void setColumna(int columna){
    this.columna = columna;
  }

  /**
    * Método que nos servirá para conocer si es Planta o Zombie.
    * @return la referencia para saber si es una Planta o Zombie.
    */
  public int getReferencia(){
    return this.referencia;
  }

  /**
    * Método que nos devuelve el ataque tras las mejoras de nuestro zombie.
    * @return ataque el ataque después de todas las mejoras.
    */
  public int obtenAtaque(){
    return this.ataque;
  }

  /**
    * Método que nos devuelve la defensa tras las mejoras de nuestro zombie.
    * @return defensa la defensa después de todas las mejoras.
    */
  public int obtenDefensa(){
    return this.defensa;
  }
}
