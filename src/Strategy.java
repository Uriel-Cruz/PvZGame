/**
  * Clase para implementar Strategy, será usado para distintos 
  * métodos de pago.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Strategy {

	/*Objeto de tipo cobrar. */
    private Cobrar cobrar;

    /**
      * Método constructor para cobrar.
      * @param cobrar la manera de cobro.
      */
    public Strategy(Cobrar cobrar){
      	this.cobrar = cobrar;
    }

    /**
      * Método usado para pagar.
      * @param monto el monto a pagar.
      */
    public void pagar(int monto){
     	cobrar.pagar(monto);
    }
}
