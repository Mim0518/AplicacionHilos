public class Media implements Runnable{
    int[] vector;
    public Media(int[] vector){
        this.vector = vector;
    }
    @Override
    public void run() {
        media();
    }
    public void media(){
        int suma = 0;
        for(int x = 0; x <= vector.length-1; x++){
            suma += vector[x];
        } 
        suma = suma/(vector.length-1);
        System.out.println("La media del vector es: "+suma);
    }
}
