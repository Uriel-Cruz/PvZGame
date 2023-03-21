import java.util.Scanner;

/**
  * Clase para representar Builder y cómo se construirá la Planta.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Builder{

  /* El escaner para recibir la opción del jugador. */
  Scanner sc = new Scanner(System.in);

  /* El nombre de la Planta. */
  String nombreplanta;
  /* La opción del jugador cuando escoga su planta. */
  int opcionplanta;
  /* El tipo de disparo que tendrá. */
  int opcionArma;
  /* El tipo de escudo que tendrá. */
  int opcionEscudo;
  /* La nueva planta a construir. */
  Plantas planta = new Plantas();


  /**
    * El método dónde el jugardor construirá a su planta.
    *
    */
  public Plantas plantBuilder(){

    try {
      System.out.println(" Te damos la bienvenida a PvZ Zombiggedon PreAlpha, ¡empecemos creando tus propias plantas! ");
      System.out.println(" Recuerda: ¡Algunos aditamentos son más caros que otros! ");
      System.out.println(" La opcion 1 es para hacer una planta a tu gusto y las otras plantas las construimos para ti");
      System.out.println(" 1. Crea tu Planta. ");
      System.out.println(" 2. Escoger Planta de Hielo ");
      System.out.println(" 3. Escoger Planta de Fuego. ");

      opcionplanta = sc.nextInt();
      switch (opcionplanta) {
        case 1:
          this.agregaArma();
          this.agregaEscudo();
          break;
        case 2:
          this.planta.agregaComponente(new Hielo());
          this.planta.agregaComponente(new Infinito());
          break;
        case 3:
          this.planta.agregaComponente(new Fuego());
          this.planta.agregaComponente(new DoncelladeH());
          break;
        default:
          System.out.println(" No eligió una opción válida, por favor elija nuevamente. ");
          plantBuilder();
          break;
      }
    return this.planta;
    } catch(java.util.InputMismatchException e) {
        System.out.println("Error, Ingresa un numero del 1 al 3");
        sc = new Scanner(System.in);
        plantBuilder();
      }
    return this.planta;
  }

  /**
    * Método usado para agregar el tipo de Disparo (Arma) que el jugador desee a su Planta.
    */
  public void agregaArma(){

    try {
      System.out.println(" Elija un tipo de Arma (Disparo) para tu planta: ");
      System.out.println(" 1. Fuego  Ataque:280 Defensa: 0 Precio: $175");
      System.out.println(" 2. Hielo  Ataque:140 Defensa: 0 Precio: $150");
      System.out.println(" 3. Tóxico Ataque:105 Defensa: 0 Precio: $125 ");
      System.out.println(" 4. Eléctrico Ataque:120 Defensa: 0 Precio: $200 ");
      System.out.println(" 5. Sombrío Ataque:185 Defensa: 0 Precio: $125");

      opcionArma = sc.nextInt();
      switch (opcionArma) {
        case 1:
          this.planta.agregaComponente(new Fuego());
          break;
        case 2:
          this.planta.agregaComponente(new Hielo());
          break;
        case 3:
          this.planta.agregaComponente(new Toxico());
          break;
        case 4:
          this.planta.agregaComponente(new Electrico());
          break;
        case 5:
          this.planta.agregaComponente(new Sombrio());
          break;
        default:
          System.out.println(" No eligió una opción válida, por favor elija nuevamente. ");
          this.agregaArma();
          break;
      }
    } catch(java.util.InputMismatchException e) {
        System.out.println("Error, Ingresa un numero del 1 al 5");
        sc = new Scanner(System.in);
        agregaArma();
      }
  }

  /**
    * Método usado para agregar el tipo de Escudo que el jugador desee a su Planta.
    */
  public void agregaEscudo(){

    try {
      System.out.println(" Elija un tipo de Escudo: ");
      System.out.println(" 1. Ostentoso Ataque:0 Defensa: 8000 Precio: $125 ");
      System.out.println(" 2. Infinito  Ataque:0 Defensa: 2000 Precio: $50 ");
      System.out.println(" 3. Doncella de Hierro Ataque:0 Defensa: 4500 Precio: $75 ");
      System.out.println(" 4. Calabaza  Ataque:0 Defensa: 4000 Precio: $150 ");
      System.out.println(" 5. Cacahuete Ataque:0 Defensa: 4000 Precio: $150");

      opcionEscudo = sc.nextInt();
      switch (opcionEscudo) {
        case 1:
          this.planta.agregaComponente(new Ostentoso());
          break;
        case 2:
          this.planta.agregaComponente(new Infinito());
          break;
        case 3:
          this.planta.agregaComponente(new DoncelladeH());
          break;
        case 4:
          this.planta.agregaComponente(new Calabaza());
          break;
        case 5:
          this.planta.agregaComponente(new Cacahuete());
          break;
        default:
          System.out.println(" No eligió una opción válida, por favor elija nuevamente. ");
          this.agregaEscudo();
          break;
      }
    } catch(java.util.InputMismatchException e) {
        System.out.println("Error, Ingresa un numero del 1 al 5");
        sc = new Scanner(System.in);
        agregaEscudo();
      }
   }
}
