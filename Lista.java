
package uspgg;

public class Lista {  
    protected Nodo inicio, fin;
   
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
    
    public void agregarAlInicio(int elemento){
        inicio = new Nodo(elemento,this.inicio);
        if(this.fin == null){
            this.fin = inicio;
        }
    }
   
    public void mostrarLista(){
        Nodo aux = this.inicio;
        while(aux != null){
            System.out.print("[" + aux.dato + "]->");
            aux=aux.siguiente;
        }
    }   
    public boolean estaVacia(){
        return this.inicio == null;
    } 
    public void agregarAlFinal(int elemento){
        if(!estaVacia()){
            this.fin.siguiente = new Nodo(elemento);
            this.fin = this.fin.siguiente;
        }else{
            this.inicio=this.fin = new Nodo(elemento);
        }
    }
    
    public int eliminarAlInicio(){
        int dato = this.inicio.dato;
        if(this.inicio == this.fin){
            this.inicio=this.fin=null;
        }else{
            this.inicio = this.inicio.siguiente;
        }
        return dato;
    }
    public int eliminarAlFinal(){
        int dato = this.fin.dato;
        if(this.inicio == this.fin){
            this.inicio=this.fin=null;
        }else{
            Nodo aux=this.inicio;
            while(aux.siguiente!=this.fin){
                aux=aux.siguiente;
            }
            this.fin=aux;
            this.fin.siguiente = null;
        }
        return dato;
    } 
    public void buscarElemento(int elemento){
        Nodo aux = this.inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.dato == elemento){
                System.out.println("[" + aux.dato + "]");
                encontrado = true;
                break;
            }
            aux = aux.siguiente;
        }
        if(encontrado == false){
            System.out.println("elemento no encontrado");
        }
    }
    public boolean existeElemento(int elemento){
        Nodo aux = this.inicio;
        while(aux != null && aux.dato != elemento){
            aux = aux.siguiente;
        }
        return aux!=null;
    }
    
     public void eliminar (int elemento){
	if (!estaVacia()){

		if(inicio==fin && elemento ==inicio.dato){
		      inicio=fin=null;
                }else if (elemento==inicio.dato){
                      inicio=inicio.siguiente;                  
                }else{
                    Nodo anterior,temporal;
                    anterior = inicio;
                    temporal=inicio.siguiente;
                    while(temporal!=null && temporal.dato!=elemento){
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                    
                    }if (temporal!=null){
                          anterior.siguiente = temporal.siguiente;
                          if (temporal==fin){
                               fin=anterior;
            }
         }
      }
   }
}
     
}