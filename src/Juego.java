import java.util.Scanner;

/**
  * Clase para Jugar al Juego.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Juego {

  /* Estados de nuestro juego. */
  EstadoJuego inicio;
  EstadoJuego menu;
  EstadoJuego comprando;
  EstadoJuego jugando;
  /* El estado en el que nos encontramos. */
  EstadoJuego estadoactual;
  Strategy strategy;
  Builder builder = new Builder();
  /* Las plantas a Construir. */
  Plantas planta;
  Plantas planta2;
  Plantas planta3;
  Plantas planta4;
  Plantas planta5;
  /* Escaner para recibir la opción del usuario. */
  Scanner sc = new Scanner(System.in);
  Scanner sc2 = new Scanner(System.in);
  int opcion;
  int opcionstrategy;
  String nombre;
  String numerotarjeta;
  String cvv;
  String fechaexpiracion;
  String correo;
  String password;
  Tablero tablero = new Tablero();
  boolean findeljuego = false;
  int dinerototal;
  int totalzombies = 1;
  Thread music_thread;
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";


  /**
    * Método constructor de nuestro juego.
    * Se asignan los estados del juego.
    */
  public Juego(){
    inicio = new Inicio(this);
    comprando = new Comprando(this);
    jugando = new Jugando(this);
    estadoactual = inicio;
    this.getInstrucciones();
    music_thread = new Thread(new PlayAudio("main-theme.wav"));
    music_thread.start();
    this.getMenu();
  }

  /**
    * Método que nos dará el menu inicial del Juego.
    *
    */
  public void getMenu(){
    try {
      System.out.println(" ¡Bienvenido a PvZ Zombieggedon PreAlpha!, selecciona una opción: ");
      System.out.println("1. Start");
      System.out.println("2. Comprar plantas");
      System.out.println("3. Jugar");

      opcion = sc.nextInt();
      switch (opcion) {
        case 1:
          this.start();
          break;
        case 2:
          this.comprar();
          break;
        case 3:
          this.jugar();
          break;
          default:
            System.out.println(ANSI_RED + " No eligió una opción válida, por favor elija nuevamente. " + ANSI_RESET);
            getMenu();
            break;
      }
    } catch(java.util.InputMismatchException e) {
      System.out.println(ANSI_RED + "Error, Ingresa un numero del 1 al 3" + ANSI_RESET);
      sc = new Scanner(System.in);
      getMenu();
    }
  }
  public void getInstrucciones(){
    System.out.println( ANSI_CYAN + "______________________________________________________________________________________");
    System.out.println("|  Consejos sobre el juego:                                                           |");
    System.out.println("|  Deberás defender tu casa y cuidar tus plantas de la oleada de Zombies.             |");
    System.out.println("|  Te daremos la oportunidad de equiparte con las mejores plantas.                    |");
    System.out.println("|  Podrás elegir el tipo de disparo de cada planta, así como el escudo que tendrán.   |");
    System.out.println("|  Recuerda: Si un zombie llega a tu casa perderás                                    |");
    System.out.println("| ¡Presiona Start para poder empezar a comprar Plantas!                               |");
    System.out.println("|_____________________________________________________________________________________|" + ANSI_RESET);
  }

  /**
    * Método para asignarle un estado al juego.
    * @param nuevoestado el estado al que pasará el juego.
    */
  public void asignarEstadoJuego(EstadoJuego nuevoestado){
    estadoactual = nuevoestado;
  }

  /**
    * Método usado para que el juego inicie.
    * @return inicio el estado inicio del juego.
    */
  public EstadoJuego getEstadoInicio(){
    return inicio;
  }

  /**
    * Método usado para que el juego regrese el menu.
    * @return menu el menu del juego.
    */
  public EstadoJuego getEstadoMenu(){
    return menu;
  }

  /**
    * Método usado para que el jugador compré dentro del juego.
    * @return comprando el estado comprando del juego.
    */
  public EstadoJuego getEstadoComprando(){
    return comprando;
  }

  /**
    * Método usado para que el jugador jugue.
    * @return jugando el estado jugando del juego.
    */
  public EstadoJuego getEstadoJugando(){
    return jugando;
  }

  /**
    * Método usado para que el juego inicie.
    */
  public void start(){
    estadoactual.start();
  }

  /**
    * Método usado para que el jugador compré dentro del juego.
    */
  public void comprar(){
    estadoactual.comprar();
  }

  /**
    * Método usado para jugar.
    */
  public void jugar(){
    estadoactual.jugar();
  }

  /**
    * Método usado para que el usuario pague, ya sea usando pago por tarjeta
    * o con saldo de Gugul Play.
    */
  public void pagoStrategy(){
    System.out.println("Con que método de pago eliges:");
    System.out.println("1. Tarjeta");
    System.out.println("2.Gugul");
    opcionstrategy = sc.nextInt();
    switch (opcionstrategy) {
      case 1:
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa el numero de la tarjeta: ");
        numerotarjeta = sc.nextLine();
        System.out.println("Ingresa el cvv: ");
        cvv = sc.next();
        System.out.println("Ingresa la fecha de expiración: ");
        fechaexpiracion = sc.next();
        Strategy strategy = new Strategy(new PagoTarjeta(nombre, numerotarjeta, cvv, fechaexpiracion));
        System.out.println("El monto a pagar es: " + this.dinerototal);
        strategy.pagar(this.dinerototal);
        break;
      case 2:
        System.out.println("Ingresa tu correo: ");
        correo = sc.next();
        System.out.println("Ingresa tu contraseña: ");
        password = sc.next();
        Strategy strategy2 = new Strategy(new PagoGugul(correo, password));
        System.out.println("El monto a pagar es: " + this.dinerototal);
        strategy2.pagar(this.dinerototal);
        break;
    }
    music_thread.stop();
  }

  /**
    * Método usado para saber cuando el juego ha terminado.
    * @return true si el juego finalizo, false en otro caso.
    */
  public boolean getfindeljuego(){
    return this.findeljuego;
  }

  /**
    * Método para asignar si el juego finalizó.
    * @param findeljuego un booleano para indicar si el juego finalizó.
    */
  public void setfindeljuego(boolean findeljuego){
    this.findeljuego = findeljuego;
  }

  /**
    * Método para colocar a la planta que se creó.
    * @param pl la planta a colocar.
    */
  public void colocaPlanta(Plantas pl){
    int fila=0;
    int columna = 0;
    String nombre1;
    try {
      System.out.println("En que fila quieres poner tu planta");
      System.out.println("Recuerda que solo puedes escoger numeros del 0 al 4 ");
      fila = sc.nextInt();
      System.out.println("En que columna quieres poner tu planta");
      columna = sc.nextInt();
      while(this.tablero.casillaOcupada(fila, columna)==true){
        System.out.println("Esa casilla ya esta ocupada, intenta otra vez");
        sc = new Scanner(System.in);
        System.out.println("En que fila quieres poner tu planta");
        System.out.println("Recuerda que solo puedes escoger numeros del 0 al 4 ");
        fila = sc.nextInt();
        System.out.println("En que columna quieres poner tu planta");
        columna = sc.nextInt();
      }
      this.tablero.insertarPlanta(pl, fila, columna);
      System.out.println("Dime el nombre de tu planta, sólo ocupa 3 letras");
      nombre1 = sc2.nextLine();
      pl.setNombre(nombre1);

    } catch(java.lang.ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Recuerda que solo puedes escoger numeros del 0 al 4 ");
      sc = new Scanner(System.in);
      sc2 = new Scanner(System.in);

      colocaPlanta(pl);
    }
  }


}
