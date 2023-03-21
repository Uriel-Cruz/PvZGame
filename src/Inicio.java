public class Inicio implements EstadoJuego{

  Juego juego;

  public Inicio(Juego juego){
    this.juego = juego;
  }

  @Override
  public void start(){
    juego.asignarEstadoJuego(juego.getEstadoComprando());
    juego.getMenu();
  }
  @Override
  public void comprar(){
    System.out.println("Presiona Start para comprar");
    juego.getMenu();

  }
  @Override
  public void jugar(){
    System.out.println("No puedes jugar, presiona Start");
    juego.getMenu();
  }

}
