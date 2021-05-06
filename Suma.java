public class Suma implements Runnable{
    int[] vector;
    public Suma(int[]vector){
        this.vector = vector;
    }
    public void run(){
        suma();
    }
    public void suma (){
        int suma = 0;
        for(int x = 0; x <= vector.length-1; x++){
            suma += vector[x];
        } 
        System.out.println("La suma de los elementos es: "+suma);
    }
    
}
