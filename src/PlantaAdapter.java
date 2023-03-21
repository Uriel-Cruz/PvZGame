/**
  * Clase para adaptar al Zombie y colocarlo en el tablero.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class PlantaAdapter extends Plantas{

  /* Objeto de tipo Zombie. */
  Zombie zombie;

  /**
    * Método constructor de nuestro Adapter; nos ayuda a colocar al Zombie en el tablero.
    * @param zombie el zombie a adaptar
    */
  public PlantaAdapter(Zombie zombie){
    this.zombie = zombie;
  }

  /**
    * Método para obtener el nombre de nuestro zombie
    * @return el nombre de nuestro zombie.
    */
  public String getNombre(){
    return this.zombie.getNombre();
  }

  /**
    * Método para obtener la fila del zombie.
    * @return la fila en la que se encuentra el zombie.
    */
  public int getFila(){
    return this.zombie.getFila();
  }

  /**
    * Método para obtener la columna del zombie.
    * @return la columna en la que se encuentra el zombie.
    */
  public int getColumna(){
    return  this.zombie.getColumna();
  }

  /**
    * Método para asignar la fila del zombie.
    * @return la fila en la que se encontrará el zombie.
    */
  public void setFila(int fila){
    this.zombie.setFila(fila);
  }

  /**
    * Método para asignar la columna del zombie.
    * @return la columna en la que se encontrará el zombie.
    */
  public void setColumna(int columna){
    this.zombie.setColumna(columna);
  }

  /**
    * Método para obtener la referencia (Con esto podemos saber si es Zombie o Planta).
    * @return la referencia del zombie.
    */
  public int getReferencia(){
    return this.zombie.getReferencia();
  }

  /**
    * Método para obtener el ataque de nuestro zombie.
    * @return el ataque del zombie.
    */
  public int obtenAtaque(){
    return this.zombie.obtenAtaque();
  }

  /**
    * Método para obtener la defensa de nuestro zombie.
    * @return la defensa del zombie.
    */
  public int obtenDefensa(){
    return this.zombie.obtenDefensa();
  }
}