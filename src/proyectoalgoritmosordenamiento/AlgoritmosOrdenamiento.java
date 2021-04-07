package proyectoalgoritmosordenamiento;

import proyectoalgoritmosordenamiento.Tenista;

/*
 @author Jason
 */
public class AlgoritmosOrdenamiento
{
    public AlgoritmosOrdenamiento(){}//Constructor vacio.
    
    public void MetodoBurbuja(int[] lista)
    {
        System.out.println("Sin Ordenar");
        for(int j = 0; j < 10; j++)
        {
            System.out.print(lista[j] + " ");
        }
        System.out.println("\n");
        
        System.out.println("Ordenado");
        for (int j = 0; j < 14; j++)
        {
            for(int i = 0; i < (14 - 1); i++) 
            {
                if (lista[i] > lista [i + 1])
                {
                    int aux;
                    aux = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = aux;
                }//Fin if
            }//Fin for
        }//Fin for
    }
    
    public void MetodoInsercion(int[] lista)
    {
        //Algoritmo de ordenamiento por inserción

        int i;
        int clave;
        int j;                

        //Recorrer el arreglo
        for (i = 1; i < 14; i++)
        {	   
            clave = lista[i];
            j = i - 1;
            //Comparar el valor selecionado con todos los valores anteriores
            while (j >= 0 && lista[i] > clave)
            {
                    //Insertar el valor donde corresponda
                    lista[j + 1] = lista[j];
                    j = j - 1;
            }
            lista[j + 1] = clave;
        }
    }
    
    

}
