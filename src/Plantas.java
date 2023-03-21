import java.util.ArrayList;
import java.util.List;

/**
  * Clase usada para nuestras plantas y sus caracteristicas.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Plantas{

  /* El nombre de nuestra planta. */
  private String nombrefinal;
  /* Lista con las características de nuestra planta. */
  private List<Caracteristica> caracteristicas = new ArrayList<Caracteristica>();
  /* LA fila y columna de nuestra planta. */
  private int fila, columna;
  /* Con esta referencia podremos identificar si es Planta o Zombie. */
  private int referencia = 1;

  /**
    * Métedo para agregar las características de nuestra planta.
    * @param car la característica a agregar.
    */
  public void agregaComponente(Caracteristica car){
      caracteristicas.add(car);
   }

   /**
     * Método para eliminar los componentes de la planta.
     *
     */
   public void eliminaComponentes(){
     caracteristicas.clear();
   }

   /**
     * Método para eliminar el nombre de nuestra planta.
     *
     */
   public void eliminaNombre(){
     this.nombrefinal = "";
   }

   /**
     * Método para obtener el costo de nuestra planta tras las mejoras
     * adquiridas.
     * @return costo el costo después de todas las mejoras.
     */
   public int obtenCosto(){
      int costo = 0;

      for (Caracteristica car : caracteristicas) {
         costo += car.precio();
      }
      return costo;
   }

   /**
     * Método que nos devuelve el ataque tras las mejoras de nuestra planta.
     * @return ataque el ataque después de todas las mejoras.
     */
   public int obtenAtaque(){
      int ataque = 0;

      for (Caracteristica car : caracteristicas) {
         ataque += car.ataque();
      }
      return ataque;
   }

   /**
     * Método que nos devuelve la defensa tras las mejoras de nuestra planta.
     * @return defensa la defensa después de todas las mejoras.
     */
   public int obtenDefensa(){
      int defensa = 0;

      for (Caracteristica car : caracteristicas) {
         defensa += car.defensa();
      }
      return defensa;
   }

   /**
     * Método para asignar el nombre de nuestra planta.
     * @param nombre el nombre que tendrá nuestra planta.
     */
   public void setNombre(String nombre){
     this.nombrefinal = nombre;
   }

   /**
     * Método para obtener el nombre de nuestra planta.
     * @return nombre el nombre de la planta.
     */
   public String getNombre(){
     return this.nombrefinal;
   }

   /**
     * Método para obtener la fila de nuestra planta.
     * @return fila la fila de nuestra planta.
     */
   public int getFila(){
     return this.fila;
   }

   /**
     * Método para asinar la fila de nuestra planta.
     * @param fila la fila en la que estará nuestra planta
     */
   public void setFila(int fila){
     this.fila = fila;
   }

   /**
     * Método para obtener la columna de nuestra planta.
     * @return columna la columna de nuestra planta.
     */
   public int getColumna(){
     return this.columna;
   }

   /**
     * Método para asignar la columna de nuestra planta.
     * @param columna la columna en la que estará nuestra planta.
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

}