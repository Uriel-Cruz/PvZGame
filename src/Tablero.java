/**
  * Clase para representar el tablero del juego.
  * @author Uriel Cruz Carmona.
  * @author Alejandro Blancas Peralta.
  */
public class Tablero{

  /* Arreglo de plantas para el tablero. */
  Plantas[][] plantas = new Plantas[5][8];

   /**
     * Método usado para imprimir el tablero del juego.
     *
     */
   public void imprimirTablero(){

     for (int i=0; i < plantas.length; i++) {
     System.out.println("");
     System.out.println("\033[32m---------------------------------------------------------------------------------\033[0m");
     for (int j=0; j<plantas[0].length; j++) {
       if(plantas[i][j]==null){
         System.out.print("\033[32m|   " + "   " + "   ");
       }else {
         System.out.print("\033[32m|   " + plantas[i][j].getNombre() + "   ");
       }
     }
     System.out.print("|*\033[0m");
   }
   System.out.println("");
   System.out.println("\033[32m-----------------------------------------------------------------------------------\033[0m");

  }

    /**
      * Método para insertar las plantas al tablero.
      * @param planta la planta a insertar.
      * @param fila la fila en la cual se va a insertar.
      * @param columna la columna en la cual se va a insertar.
      */
    public void insertarPlanta(Plantas planta, int fila, int columna){
        this.plantas[fila][columna] = planta;
    }

    /**
      * Método para insertar a los zombies al tablero.
      * @param plantazombie el zombie adaptado a insertar.
      */
    public void insertarZombie(PlantaAdapter plantazombie){
      int numero1, numero2;
      numero1 = (int) (Math.random() * 4) + 1;
      numero2 = 7;
      plantazombie.setFila(numero1);
      plantazombie.setColumna(7);
      this.plantas[numero1][numero2] = plantazombie;
    }

    /**
      * Método para mover a los zombies en el tablero.
      * @param fila la fila a la cual se va moverá.
      * @param columna la columna en la cual se moverá.
      */
    public void moverZombie(int fila, int columna){
      this.plantas[fila][columna-1] = plantas[fila][columna];
      plantas[fila][columna-1].setColumna(plantas[fila][columna].getColumna()-1);
      plantas[fila][columna] = null;
    }

    /**
      * Método para saber si hay una planta en está casilla.
      * @param fila la fila en la cual se revisará.
      * @param columna la columna en la cual se revisará.
      */
    public boolean hayPlanta(int fila, int columna){
      if(this.plantas[fila][columna-1] == null){
        return false;
      }else{
        return true;
      }
    }

    /**
      * Método usado para mover a todos los zombies una casilla a la izquierda.
      *
      */
    public void moveratodosZombies(){
      for (int i=0; i < plantas.length; i++) {
        for (int j=0; j<plantas[0].length; j++) {
          if(plantas[i][j]!=null){
            if(plantas[i][j].getReferencia() == 2){
              moverZombie(i, j);
            }else{
              continue;
            }
          }else{
            continue;
          }
        }
      }
    }

    /**
      * Método usado para que el zombie detecte si tiene una planta en frente.
      * @return boolean true si hay planta en frente del zombie, false en otro caso.
      */
    public boolean detectarPlanta(){
      for (int i=0; i < plantas.length; i++) {
        for (int j=0; j<plantas[0].length; j++) {
          if(plantas[i][j]!=null){
            if(plantas[i][j].getReferencia() == 2 && this.hayPlanta(i, j)==true){
              return true;
            }else{
              continue;
            }
          }else{
            continue;
          }
        }
      }
      return false;
    }

    /**
      * Método usado saber cuando una planta fue derrotada por un zombie.
      *
      */
    public boolean murioPlanta(){
      for (int i=0; i < plantas.length; i++) {
        for (int j=0; j<plantas[0].length; j++) {
          if(plantas[i][j]!=null){
            if(plantas[i][j].getReferencia() == 2 && this.hayPlanta(i, j)==true){
              if((plantas[i][j].obtenAtaque()+plantas[i][j].obtenDefensa()) > (plantas[i][j-1].obtenAtaque()+plantas[i][j-1].obtenDefensa())){
                plantas[i][j-1] = null;
                this.moverZombie(i, j);
                return true;
              }else{
                plantas[i][j] = null;
                return false;
              }
            }else{
              continue;
            }
          }else{
            continue;
          }
        }
      }
      return false;
    }

    /**
      * Método usado saber si un zombie llego hasta la casa del jugador.
      * @return boolean true si el zombie ya llego al inicio de arreglo
      * false en otro caso.
      */
    public boolean llegoZombie(){
      for (int i=0; i < plantas.length; i++) {
        for (int j=0; j<plantas[0].length; j++) {
          if(plantas[i][j]!=null){
            if(plantas[i][j].getReferencia() == 2 && casillaOcupada(i, 0) == true){
              return true;
            }else{
              continue;
            }
          }else{
            continue;
          }
        }
      }
        return false;
    }

    /**
      * Método usado saber si la casilla se encuentra ocupada.
      * @return boolean true si la casilla ya está ocupada, false en otro caso.
      */
    public boolean casillaOcupada(int i, int j){
      if(plantas[i][j] != null){
        return true;
      }else{
        return false;
      }
    }

    /**
      * Método usado saber si aún quedan Zombies en el tablero.
      * @return boolean true si aún quedan Zombies en el tablero, false en otro caso.
      */
    public boolean hayZombies(){
      for (int i=0; i < plantas.length; i++) {
        for (int j=0; j<plantas[0].length; j++) {
          if(plantas[i][j]!=null){
            if(plantas[i][j].getReferencia() == 2){
              return true;
            }else{
              continue;
            }
          }else{
            continue;
          }
        }
      }
        return false;
    }

}
