import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        bubblesort();
    }

    private static void bubblesort(){
        Scanner user_Input = new Scanner(System.in);

        System.out.println("Enter de vetor size:");
        int vetor_Size = user_Input.nextInt();

        int[] vetor = new int[vetor_Size];

        System.out.println("Vetor Desordenado!");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor_Size);
            System.out.print(vetor[i]);
        }

        System.out.println();

        int auxiliar;
        for (int i = 0; i < vetor.length+1; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        }
        System.out.println("Vetor Ordenado!");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }
    }
}
