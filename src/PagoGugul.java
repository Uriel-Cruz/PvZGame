/**
  * Clase usada para que el jugador pague con Gugul Play.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class PagoGugul implements Cobrar {

	/* La dirección de correo del jugador. */
	private String email;
	/* La contraseña del jugador. */
	private String password;

	/**
	  * Método constructor del Pago Gugul.
	  * @param email el correo del jugador.
	  * @param password la contraseña del jugador.
	  */
	public PagoGugul(String email, String password){
		this.email=email;
		this.password=password;
	}

	/**
	  * Método usado para que el jugador pague con su saldo de Gugul.
	  * @param monto el monto que deberá pagar el jugador.
	  */
	@Override
	public void pagar(int monto) {
		System.out.println(monto + " pago realizado con Gugul.");
	}

}
