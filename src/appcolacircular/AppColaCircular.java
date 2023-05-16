/*
Algoritmo de Cola Circular, adaptado a Java
 */
package appcolacircular;

import java.util.Random;

public class AppColaCircular
{

    public static void main(String[] args)
    {
        boolean band = true;
        int superCont = 1;
        do
        {
            ColaCircular cola = new ColaCircular(5);
            Numero valor = new Numero();
            int[] vec = new int[1];
            //La referencia tiene que ser un objeto, de lo contrario no funcionara
            Random rnd = new Random();
            int cont = 0;
            while (!cola.estaLlena())
            {
                int val = rnd.nextInt(1, 99);
                if (cola.insertar(val))
                {
                    System.out.println("Dato insertado: " + val);
                    cola.mostrar();
                    cont++;
                } else
                {
                    System.out.println("OVERFLOW, COLA LLENA");
                    band = false;
                    break;
                }

                if (cont == 3)
                {
                    cola.eliminar(vec);
                    System.out.println("Dato eliminado: " + vec[0]);
                    cola.mostrar();
                }
            }

            while (cont > 0)
            {
                if (cola.eliminar(vec))
                {
                    System.out.println("Dato eliminado " + vec[0]);
                    cola.mostrar();
                } else
                {
                    System.out.println("UNDERFLOW, COLA VACIA");
                    break;
                }
            }
        } while (band || superCont == 3);
        //Agregar el codigo necesario para realizar
        //Tres veces la aplicacion
    }
//86, 156 ,214
}
