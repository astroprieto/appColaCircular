package appcolacircular;

public class ColaCircular
{

    int[] cola;
    int primero, ultimo;
    int max;//Max Size

    public ColaCircular(int tam)
    {
        //Se puede asignar un valor dentro de la creacion
        // de un arreglo
        cola = new int[max = tam];
        primero = ultimo = -1;
    }

    public boolean insertar(int valor)
    {
        // EN JAVA EL ARREGLO INICIA EN 0
        //PERO PUEDE SER DIFERENTE SI GUSTAMOS
        if ((ultimo == max - 1) && (primero == 0) || (ultimo + 1 == primero))
        {
            return false;
        } else if (ultimo == max - 1)
        {
            ultimo = 0;
        } else
        {
            //Alternativas:
            //ultimo += 1;
            //ultimo = ultimo + 1;
            ultimo++;
        }
        cola[ultimo] = valor;
        if (primero == -1)
        {
            primero = 0;
        }
        return true;
    }

    public boolean eliminar(Numero dato)
    {
        if (primero == -1)
        {
            return false;
        }

        dato.valor = cola[primero];
        if (primero == ultimo)
        {
            cola[primero] = -1;//checamos si este va aqui
            primero = ultimo = -1;
        } else if (primero == max - 1)
        {
            cola[primero] = -1;//o aca :3
            primero = 0;
        } else
        {
            cola[primero] = -1;// o aca iwi
            primero++;
        }

        return true;
    }

    public boolean estaVacia()
    {
        return primero == -1;
    }

    public boolean estaLlena()
    {
        int resul = (ultimo + 1) % max;//Matematicamnete hablando q significa esto XD
        return resul == primero;
        //return ultimo >= cola.length - 1;
    }

    public void mostrar()
    {
        System.out.println("\33[31mDatos en la cola");
        for (int i = 0; i < cola.length; i++)
        {
            System.out.print("\33[34m [" + cola[i] + "] ");
        }
    }
    //Implementar la aplicacion para probar la clase cola circular
    /*
        Prueba de escritorio de la cola circular y el metodo
        estaLlena, subirla el lunes a la 17:00;
     */
}
