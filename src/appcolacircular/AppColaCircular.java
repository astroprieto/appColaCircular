/*
Algoritmo de Cola Circular, adaptado a Java
 */
package appcolacircular;

public class AppColaCircular
{

    public static void main(String[] args)
    {
        ColaCircular cola = new ColaCircular(4);
        Numero valor = new Numero();
        cola.insertar(15);
        cola.insertar(5);
        cola.insertar(25);
        cola.insertar(35);
        cola.mostrar();
        System.out.println("\n" + cola.estaVacia());
        System.out.println(cola.estaLlena());
    }

}
