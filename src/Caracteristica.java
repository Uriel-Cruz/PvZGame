/**
  * Interfaz para reprsentar las características que tiene la Planta.  
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public interface Caracteristica{

	/* El nombre que el jugador le asigne a su Planta. */
	public String nombre();
	/* El precio de la Planta por mejoras. */
	public double precio();
  	/* El nivel de ataque que tendrá la Planta. */
  	public int ataque();
  	/* El nivel de defensa que tendrá la Planta. */
  	public int defensa();
}
