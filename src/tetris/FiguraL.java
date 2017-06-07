
package tetris;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Daniel
 */
public class FiguraL {
    
// Figuras L de la pieza de juego
    enum Figura {
  
     	L, 
      	
 	};
 
 	// Se definene los puntos de coordenadas iniciales de la figura
 	private int[][][] plantilla_de_coordenadas;
 
     // Contiene las coordenadas de la pieza
     private int coordenadas[][];
     
 	// Aqui se almacenara la forma actual de la pieza
     private Figura forma_actual;
     
     // Numero de coordenadas relativas de la Pieza
     private int num_coord_rel = 4;
     
     // Numero de atributos que tiene cada coordenada relativa (X e Y)
     private int num_ejes = 2;
     
 	/**
 	 * Constructor
 	 */
     public FiguraL()
     {
     	// La pieza tiene 4 coordenedas relativas con 2 posiciones
         coordenadas = new int[num_coord_rel][num_ejes];
         
         
         asignarFigura(Figura.L);
     }
 
     /**
      * Dada una forma le asignamos sus coordenadas iniciales
      * 
      * @param forma	: Forma elegida que hay que asignar a la Pieza L
      */
     public void asignarFigura(Figura forma) 
     {
     	// Plantilla de coordenadas relativas de cada una de las formas enumeradas en Figuras
           plantilla_de_coordenadas = new int[][][] {
     	
     		
     		//Figura L
     		{ {-1,-1 }, { 0,-1 }, { 0, 0 }, { 0, 1 } },
   
 		};
 
         // Asignamos las coordenadas relativas de la forma elegida
         for (int i = 0; i < num_coord_rel ; i++) {
         	for (int j = 0; j < num_ejes; ++j) {
         		
         		// Como los elementos de un enum son basicamente numeros enteros, con ordinal()
         		// obtenemos la posicion en forma de entero de la forma dentro del enum
         		coordenadas[i][j] = plantilla_de_coordenadas[forma.ordinal()][i][j];
         	}
         }
          
         forma_actual = forma;
    }
 
     /**
      * Asignamos la posicion X a una de las 4 coordenadas relativas de la pieza 
      * 
      * @param posicion_relativa : Coordenada relativa a modificar
      * @param x : Nueva posicion del eje de las X
      */
     private void asignarX(int posicion_relativa, int x) 
     { 
     	coordenadas[posicion_relativa][0] = x; 
 	}
     
     /**
      * Asignamos la posicion Y a una de las 4 coordenadas relativas de la pieza 
      * 
      * @param posicion_relativa : Coordenada relativa a modificar
      * @param y : Nueva posicion del eje de las Y
      */
     private void asignarY(int posicion_relativa, int y) 
     {
     	coordenadas[posicion_relativa][1] = y;
 	}
     
     /**
      * Obtenemos la posicion X de una coordenada relativa
      * 
      * @param posicion_relativa : Coordenada relativa a consultar
      * @return : posicion X
      */
     public int obtenerX(int posicion_relativa) 
     {
     	return coordenadas[posicion_relativa][0]; 
 	}
     
     /**
      * Obtenemos la posicion Y de una coordenada relativa
      * 
      * @param posicion_relativa : Coordenada relativa a consultar
      * @return : posicion Y
      */
     public int obtenerY(int posicion_relativa) 
     { 
     	return coordenadas[posicion_relativa][1]; 
 	}
     
     public int obtenerNumCoordRel()
     {
     	return num_coord_rel;
     }
     
     /**
      * Obtenemos la forma actual de la pieza
      * 
      * @return
      */
     public Figura
                 
         obtenerForma()
     {
     	return forma_actual; 
 	}
 
 	/**
 	 * Escogemos aleatoriamete pieza y le asignamos forma a la Pieza
 	 */
     public void escogerPiezaAleatoriamente()
     {
     	Random r = new Random();
     	
     	// Obtenemos las formas disponibles
     	Figura[] figuras_disponibles = Figura.values();
     	
     	// Escogemos aleatoriamente una forma
         Figura forma_elegida = figuras_disponibles[(Math.abs(r.nextInt()) % 7 + 1)];
         
         // Se la asignamos a la Pieza
         asignarFigura(forma_elegida);
     }
     
     /**
      * Obtenemos la menor posición Y (posicion mas baja en el tablero) de las coordenadas relativas
      * 
      * @return : Coordenada Y
      */
     public int obtenerYMinima() 
     {
     	// Empezamos asumiendo que es la primera la menor
     	int minima = coordenadas[0][1];
     	
     	// Comparamos con el resto de coordenadas relativas
     	for (int i=0; i < num_coord_rel; i++) {
     		minima = Math.min(minima, coordenadas[i][1]);
     	}
     	
     	return minima;
     }
 
     /**
      * Realiza la rotación en una copia de la pieza.
      * 
      * La rotacion se realiza en el sentido de las agujas del reloj.
      *  
      * @return : Pieza rotada
      */
     public FiguraL rotar()
     {
     	// La figura no gira
         if (forma_actual == Figura.L){
             return this;
         }
 
         FiguraL PiezaRotada = new FiguraL();
         PiezaRotada.forma_actual = forma_actual;
 
         // Realizamos el giro a la derecha
         for (int i = 0; i < num_coord_rel; ++i) {
         	PiezaRotada.asignarX(i, -obtenerY(i));
             PiezaRotada.asignarY(i, obtenerX(i));
         }
         
         return PiezaRotada;
     }
     
 }

