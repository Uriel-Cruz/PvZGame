import java.util.Scanner;

/**
  * Clase para representar el estado "Comprando" de nuestro juego.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Comprando implements EstadoJuego{

  /* Objeto juego. */
  Juego juego;
  /* Escaner para registrar las opciones de nuestro jugador. */
  Scanner sc = new Scanner(System.in);
  Scanner sc2 = new Scanner(System.in);
  /* El nombre que el jugador asignará a sus plantas. */
  String nombre1, nombre2, nombre3, nombre4, nombre5;
  /* La fila y columna en la cuál colocará sus plantas. */
  int fila, columna, fila2, columna2, fila3, columna3;
  int fila4, columna4, fila5, columna5;
  Thread music_thread;

  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";

  public Comprando(Juego juego){
    this.juego = juego;
  }

  /**
    * Método para iniciar el juego.
    *
    */
  @Override
  public void start(){
    System.out.println("Ya presionaste start");
    juego.getMenu();
  }

  /**
    * Método en el cuál el jugador podrá comprar.
    *
    */
  @Override
  public void comprar(){
    juego.planta = juego.builder.plantBuilder();
    juego.colocaPlanta(juego.planta);
    System.out.println(" Las estadísticas de tu primera planta son:");
    System.out.println(" Costo:");
    System.out.println(juego.planta.obtenCosto());
    System.out.println(" Ataque:");
    System.out.println(juego.planta.obtenAtaque());
    System.out.println(" Defensa:");
    System.out.println(juego.planta.obtenDefensa());
    juego.dinerototal += juego.planta.obtenCosto();

    juego.builder.planta = null;
    juego.builder.planta = new Plantas();

    System.out.println("Escoge tu segunda planta");
    juego.planta2 = juego.builder.plantBuilder();

    juego.colocaPlanta(juego.planta2);
    System.out.println(" Las estadísticas de tu segunda planta son:");
    System.out.println(" Costo:");
    System.out.println(juego.planta2.obtenCosto());
    System.out.println(" Ataque:");
    System.out.println(juego.planta2.obtenAtaque());
    System.out.println(" Defensa:");
    System.out.println(juego.planta2.obtenDefensa());
    juego.dinerototal += juego.planta2.obtenCosto();
    juego.builder.planta = null;
    juego.builder.planta = new Plantas();

    System.out.println("Escoge tu tercera planta");
    juego.planta3 = juego.builder.plantBuilder();

    juego.colocaPlanta(juego.planta3);
    System.out.println(" Las estadísticas de tu tercera planta son:");
    System.out.println(" Costo:");
    System.out.println(juego.planta3.obtenCosto());
    System.out.println(" Ataque:");
    System.out.println(juego.planta3.obtenAtaque());
    System.out.println(" Defensa:");
    System.out.println(juego.planta3.obtenDefensa());
    juego.dinerototal += juego.planta3.obtenCosto();
    juego.builder.planta = null;
    juego.builder.planta = new Plantas();

    System.out.println("Escoge tu cuarta planta");
    juego.planta4 = juego.builder.plantBuilder();
    juego.colocaPlanta(juego.planta4);

    System.out.println(" Las estadísticas de tu cuarta planta son:");
    System.out.println(" Costo:");
    System.out.println(juego.planta4.obtenCosto());
    System.out.println(" Ataque:");
    System.out.println(juego.planta4.obtenAtaque());
    System.out.println(" Defensa:");
    System.out.println(juego.planta4.obtenDefensa());
    juego.dinerototal += juego.planta4.obtenCosto();

    juego.builder.planta = null;
    juego.builder.planta = new Plantas();

    System.out.println("Escoge tu quinta planta");
    juego.planta5 = juego.builder.plantBuilder();

    juego.colocaPlanta(juego.planta5);
    System.out.println(" Las estadísticas de tu quinta planta son:");
    System.out.println(" Costo:");
    System.out.println(juego.planta5.obtenCosto());
    System.out.println(" Ataque:");
    System.out.println(juego.planta5.obtenAtaque());
    System.out.println(" Defensa:");
    System.out.println(juego.planta5.obtenDefensa());
    juego.dinerototal += juego.planta5.obtenCosto();

    juego.pagoStrategy();
    System.out.println(" ¡Una vez escogidas tus plantas es hora de jugar!");
    System.out.println( ANSI_RED + " Preparados... ");
    System.out.println(" Listos... ");
    System.out.println(" ¡A Plantar!" + ANSI_RESET);
    music_thread = new Thread(new PlayAudio("loon-skir.wav"));
    music_thread.start();
    juego.asignarEstadoJuego(juego.getEstadoJugando());
    juego.jugar();
  }

  /**
    * Método para iniciar el juego.
    *
    */
  @Override
  public void jugar(){
    System.out.println("Aún no puedes jugar, estas en la tienda");
    juego.getMenu();
  }

}
