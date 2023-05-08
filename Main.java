// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.*;
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] ai = new int[N];
        int[] bi = new int[N];
        for (int i = 0; i < N; i++){
            ai[i] = input.nextInt();
        }
        for (int j  = 0; j<N; j++){
            bi[j] = input.nextInt();
        }


        for(int p=0; p<N; p++){
            for(int q=0; q<N; q++){
                if (M >= ai[q]){
                    M += bi[q];
                    bi[q] = 0;
                }
            }
        }
        System.out.println(M);


    }
}