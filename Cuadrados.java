public class Cuadrados implements Runnable{
    int[] vector;
    public Cuadrados(int[]vector){
        this.vector = vector;
    }
    @Override
    public void run() {
        cuadrado();
    }
    public void cuadrado(){
        int cuadrados = 0;
        for(int x = 0; x <= vector.length-1; x++){
            int pre = vector[x]*vector[x];
            cuadrados += pre;
        }
        System.out.println("La suma de los cuadrados del vector es: "+cuadrados);
    }
}
