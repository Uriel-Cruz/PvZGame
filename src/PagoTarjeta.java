/**
  * Clase usada para que el jugador pague con Tarjeta.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class PagoTarjeta implements Cobrar {

	/* Nombre del propietario de la tarjeta. */
	private String nombre;
	/* Número de la tarjeta. */
	private String numerotarjeta;
	/* Número de seguridad. */
	private String cvv;
	/* Fecha de vencimiento. */
	private String fechaexpiracion;

	/**
	  * Método constructor del Pago con Tarjeta.
	  * @param nombre el nombre del propietario de la tarjeta.
	  * @param numerotarjeta el número de la tarjeta.
	  * @param cvv el número de seguridad.
	  * @param fechaexpiracion la fecha de vencimiento.
	  */
	public PagoTarjeta(String nombre, String numerotarjeta, String cvv, String fechaexpiracion){
		this.nombre=nombre;
		this.numerotarjeta=numerotarjeta;
		this.cvv=cvv;
		this.fechaexpiracion=fechaexpiracion;
	}

	/**
	  * Método usado para que el jugador pague con su Tarjeta.
	  * @param monto el monto que deberá pagar el jugador.
	  */
	@Override
	public void pagar(int monto) {
		System.out.println(monto +" pago realizado con tarjeta bancaria");
	}

}
