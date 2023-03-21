/**
  * Clase Abstracta para representar el Escudo que se le equipará a la Planta.  
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class DoncelladeH extends Escudo{

    /**
      * Método usado para el nombre de nuestro Escudo.
      * @return el nombre del Escudo equipado.
      */
    @Override
	   public String nombre(){
		    return "Escudo: Doncella de Hierro";
	  }

    /**
      * Método usado para indicar el costo del aditamento del Escudo.
      * @return el precio del Escudo equipado.
      */
    @Override
	   public double precio(){
		    return 75.0;
	  }

    /**
      * Método usado para indicar el nivel de ataque que tendrá.
      * @return el nivel de ataque que suma equipar este Escudo.
      */
    @Override
	   public int ataque(){
		    return 0;
	  }

    /**
      * Método usado para indicar el nivel de defensa que tendrá.
      * @return el nivel de defensa que suma equipar este Escudo.
      */
    @Override
	   public int defensa(){
		    return 4500; //12500
	  }
 }
