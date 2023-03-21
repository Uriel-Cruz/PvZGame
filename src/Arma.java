/**
  * Clase Abstracta para representar el tipo de disparo (Arma) que se le equipará a la Planta.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public abstract class Arma implements Caracteristica{

	/**
      * Método abstracto usado para el precio de cada disparo (Arma).
      */
	@Override
	public abstract double precio();

}
