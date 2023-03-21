/**
  * Clase para representar las Armas (Disparos), en este caso,
  * Fuego que se le equiparan a la Planta.  
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Fuego extends Arma{

	/**
      * Método usado para el nombre de nuestro Arma (Disparo).
      * @return el nombre del arma equipada.
      */
	@Override
	 public String nombre(){
		return "Ataque: Fuego";
	}

	/**
      * Método usado para indicar el costo del aditamento de esta Arma.
      * @return el precio del Arma equipada.
      */
	@Override
	 public double precio(){
		return 175.0;
	}

    /**
      * Método usado para indicar el nivel de ataque que tendrá.
      * @return el nivel de ataque que suma equipar esta Arma.
      */
    @Override
	 public int ataque(){
		return 280;
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
