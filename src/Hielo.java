/**
  * Clase para representar las Armas (Disparos), en este caso,
  * Hielo que se le equiparan a la Planta.  
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Hielo extends Arma{

	/**
    * Método usado para el nombre de nuestro Arma (Disparo).
    * @return el nombre del arma equipada.
    */
	@Override
	 public String nombre(){
		return "Ataque: Hielo";
	}

	/**
    * Método usado para indicar el costo del aditamento de esta Arma.
    * @return el precio del Arma equipada.
    */
	@Override
	public double precio(){
		return 150.0;
	}

  /**
    * Método usado para indicar el nivel de ataque que tendrá.
    * @return el nivel de ataque que suma equipar esta Arma.
    */
  @Override
	 public int ataque(){
		return 140;
	}

  /**
    * Método usado para indicar el nivel de defensa que tendrá.
    * @return el nivel de defensa que suma equipar esta Arma.
    */
  @Override
	 public int defensa(){
		return 0;
	}
 }
