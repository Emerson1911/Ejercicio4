import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        //System.out.println("Por favor ingese el tamaño del array:");
        //int n = teclado.nextInt();
         int[] array= new int[10]; 

        for (int i = 0; i < array.length; i++){
            System.out.print("Ingrese dato"+(i+1)+": ");
            array [i] = teclado.nextInt();
        }

        int mayor,menor;
        mayor = menor = array [0];

        for (int i = 0; i < array.length; i++){
            if(array [i] > mayor){
                mayor = array[i];
            }if(array [i] < menor){
                menor = array[i]; 
            }
        }
        System.out.println("El mayor valor es :"+mayor);
        System.out.println("El menor valor es :"+menor);
    }
}
