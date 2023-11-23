import javax.swing.JOptionPane;

public class somaMatrizes {
    public static void main(String[] args) {
        int linhas = tamanho("Digite o número de linhas:");
        int colunas = tamanho("Digite o número de colunas:");
        float[][] matrizA = matriz("Digite os elementos da primeira matriz:", linhas, colunas);
        float[][] matrizB = matriz("Digite os elementos da segunda matriz:", linhas, colunas);
        float[][] soma = somarMatriz(matrizA, matrizB);
        matrizResultante("A soma das matrizes é:", soma);
    }

    private static int tamanho(String A) {
        String S = JOptionPane.showInputDialog(null, A);
        return Integer.parseInt(S);
    }
    private static float[][] matriz(String A, int linhas, int colunas) {
        float[][] matriz = new float[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String B = JOptionPane.showInputDialog(null, A + "\nElemento [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = Float.parseFloat(B);
            }
        }
        return matriz;
    }
    private static float[][] somarMatriz(float[][] matriz1, float[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        float[][] somaMatriz = new float[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return somaMatriz;
    }
    private static void matrizResultante(String A, float[][] matriz) {
        StringBuilder S = new StringBuilder(A + "\n");
        for (float[] linha : matriz) {
            for (float elemento : linha) {
                S.append(elemento).append(" ");
            }
            S.append("\n");
        }
        JOptionPane.showMessageDialog(null, S.toString());
    }
}
