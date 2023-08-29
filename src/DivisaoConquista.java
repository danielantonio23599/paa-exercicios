import java.util.ArrayList;
import java.util.List;

public class DivisaoConquista {
    public static void main(String[] args) {
        int[][] matriz = {{1,0,1,1,0},
                          {0,1,0,1,0},
                          {0,1,1,1,0},
                          {0,0,0,1,0},
                          {0,0,0,1,1}};
        procurar(matriz);

    }
    public static void procurar(int[][] matriz){
        List<Integer> ignora = new ArrayList<>();
        for(int i = 0; i < 5; i ++){

            for(int j = 0 ; j < 5; j ++) {
                if (j == i);
                else if (ignora.contains(j));
                 else if(matriz[i][j] == 1) {
                    ignora.add(i);
                    break;
                } else if (j==4) {
                    if(confere(matriz, i)) {
                        System.out.println("O indice que é celebridade: "+ i);
                        break;
                    }
                }
            }
        }
    }

    public static boolean confere(int[][] matriz, int linha) {
        for( int j = 0 ; j < 5; j ++) {
            if (matriz[linha][j] == 1 && j != linha){
                return false;
            }
        }
        return true;
    }

}
