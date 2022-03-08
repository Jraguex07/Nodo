
package uspg;

import java.util.Scanner;
import uspgg.Lista;

public class Ejercicios {
    
    Scanner in = new Scanner(System.in);
    Lista lista = new Lista();
    
 
    public static void main(String[] args) {
        
        Ejercicios list = new Ejercicios();
        list.menu();

    }
    public void menu(){
        boolean  exit = false;
        int opcion;
        while(!exit) {
            System.out.println("------------Bienvenido a Citrix Connect-------------");
            System.out.println("Que desea realizar: \n"
                    + "1.Add \n"
                    + "2.Print\n"
                    + "3.Add Last \n"
                    + "4.Delete First\n"
                    + "5.Delete Last\n"
                    + "6.Find\n"
                    + "7.delete specific Number\n"
                    + "8.exit\n"); 
            
            
            System.out.println("Digite una opcion");

            opcion = in.nextInt();
            switch(opcion) {

                case 1:   
                    add();
                    break;   

                case 2: 
                    lista.mostrarLista();
                    break;  
                    
                case 3: 
                    addLast();
                    break;  
                    
                case 4: 
                    lista.eliminarAlInicio();
                    break;  
                case 5: 
                    lista.eliminarAlFinal();
                    break;  
                   
                case 6:
                    find();
                    break;
                    
                case 7:
                    Eliminar();
                    break;
                            
                case 8:

                    exit= true;
                    break;
                default: 
                    System.out.println("Se ha equivocado de menu de opcion");
                break;        
            } 
          }
    }


    public void add(){
        int elemento;    
        System.out.println("ingresar");
        elemento = in.nextInt();
        lista.agregarAlInicio(elemento);
    }
  
    public void  addLast(){
        System.out.println("ingresar elemento");
        lista.agregarAlFinal(in.nextInt());
     
    }
    public void find(){
        System.out.println("Ingrese elemento a buscar");
        lista.buscarElemento(in.nextInt()); 
    }
    
    public void Eliminar(){
        System.out.println("ingrese Numero a eliminar");
        lista.eliminar(in.nextInt());
    
    
    }
 }   
  


