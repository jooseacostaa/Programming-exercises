package voltearvector;

public class VoltearVector {

    public static void main(String[] args) {
        
        int [] v = new int [10]; //declaramos e instaciamos el vector
        
        //lo voy a rellenar con numeros del 1 al 10 con un bucle for
        
        for (int t=0;t<v.length;t+=1){
            
            v[t]= t + 1; // aqui estoy diciendo que v de t que va incrementando es igual a t que en principio en 1 y con cada paso por el bucle incrementa en 1
            
            
        }
        
        for (int t=0;t<v.length;t+=1){
            
            System.out.print(v[t]+" "); //imprimimos en pantalla y quito el ln para que salgan los numeros seguidos y le concateno un espacio (" ") para que queden los números separados
            
        }
        
        //Volteamos el vector intercambiando los extremos
        
        for (int t=0;t<v.length / 2;t+=1){ //aqui la diferencia es que divido entre 2 el v.length ya que tengo que hacer los cambios hasta la mitad del vector como se dijo en clase
            
            int temp = v[t];  //declaramos una variable temporal 
            v[t] = v[v.length - 1 - t]; //decimos que v[t] es igual a la longitud de v -1 -t 
            v [v.length - 1 - t] = temp; // aqui se completa el cambio
            
        }
        
        System.out.println(" ");
        
        for (int t=0;t<v.length;t+=1){
            
            System.out.print(v[t]+" ");
            
        }
        
        System.out.println(" ");
        
    }
    
}
