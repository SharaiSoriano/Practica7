
import java.util.Scanner;

class main {
 public static void main(String[] args){

  int opcion;
  Scanner entrada = new Scanner(System.in);
  
  do{

      System.out.println(" Seleccione un Bird" );
      System.out.println("1. Chuck");
      System.out.println("2. Bomb");
      System.out.println("3. Terence");
      System.out.println("4. Salir");
      opcion = entrada.nextByte();
      switch(opcion)
      {
        case 1: System.out.println("1.Caracteristicas:");
                Chuck b1 = new Chuck("Chuck", "Amarillo", "Velocidad", "Canario");
                bird1.mostrarBird1();
                
                break;
        case 2: System.out.println("1.Caracteristicas:");
                Bomb b2 = new Bomb("Bomb", "Negro", "Explotar", "Cuervo" );
                Bomb.mostrarBird2();

                   break;

        case 3: System.out.println("1.Caracteristicas:");
                Terence b3 = new Terence("Terence", "Rojo gordo", "Su peso", "Cardenal");
                bird1.mostrarBird3();
                break;
        case 4: break;
      }

  } 
      while(opcion != 4);
      {
        entrada.close();
      }
    
  }
}