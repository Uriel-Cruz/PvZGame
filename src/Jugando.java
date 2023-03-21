import java.util.Scanner;
/**
  * Clase para representar el estado "Jugando" de nuestro juego.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Jugando implements EstadoJuego{
  Scanner sc = new Scanner(System.in);
  String entrada;
  Thread music_thread;

  /* Objeto juego. */
  Juego juego;

  /**
    * Método constructor de nuesto juego.
    * @param juego un objeto de tipo juego.
    */
  public Jugando(Juego juego){
    this.juego = juego;
  }

  /**
    * Método para iniciar el juego.
    *
    */
  @Override
  public void start(){}

  /**
    * Método en el cuál el jugador podrá comprar.
    *
    */
  @Override
  public void comprar(){}

  /**
    * Método para iniciar el juego.
    *
    */
  @Override
  public void jugar(){

    Zombie zombie = new Zombie(60, 50, "ZZZ");
    PlantaAdapter zombieadapter = new PlantaAdapter(zombie);
    Zombie zombie2 = new Zombie(70, 60, "ZZZ");
    PlantaAdapter zombieadapter2 = new PlantaAdapter(zombie2);
    juego.tablero.insertarZombie(zombieadapter);

    while(juego.findeljuego == false){
      System.out.println("Presiona Enter para visualizar la partida");
      entrada = sc.nextLine();
      juego.tablero.imprimirTablero();
      juego.tablero.moveratodosZombies();
      if(juego.totalzombies < 2){
        juego.tablero.insertarZombie(zombieadapter2);
        juego.totalzombies += 1;
      }else{
        juego.setfindeljuego(false);
      }
      sc = new Scanner(System.in);

      if(juego.tablero.hayZombies()==false){
        juego.setfindeljuego(true);
        System.out.println(" ¡Las Plantas Ganan!");
        VisualizacionGif vp = new VisualizacionGif();
        vp.VisualizacionGifP();
      }else{
        juego.setfindeljuego(false);
      }
      if(juego.tablero.llegoZombie()==true){
        juego.setfindeljuego(true);
        System.out.println(" The Zombies Ate Your Brains! ");
        VisualizacionGif vp = new VisualizacionGif();
        vp.VisualizacionGifZ();
      }else{
        if(juego.tablero.detectarPlanta()==true){
          if(juego.tablero.murioPlanta()==true){
            System.out.println(juego.tablero.murioPlanta());
            juego.setfindeljuego(true);
            System.out.println(" The Zombies Ate Your Brains! ");
            VisualizacionGif vp = new VisualizacionGif();
            vp.VisualizacionGifZ();
          }else{
            juego.setfindeljuego(false);
          }
        }else{
          juego.setfindeljuego(false);
        }
      }
     }
  }

}
