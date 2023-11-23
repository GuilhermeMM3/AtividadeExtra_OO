import javax.swing.JOptionPane;

public class multiplicacaoMatrizes {
    public static void main(String[] args) {
        int linhas = tamanho("Digite o número de linhas:");
        int colunas = tamanho("Digite o número de colunas:");
        float[][] matrizA = matriz("Digite os elementos da primeira matriz:", linhas, colunas);
        float[][] matrizB = matriz("Digite os elementos da segunda matriz:", colunas, linhas);
        float[][] resultado = multiplicaoMatriz(matrizA, matrizB);
        matrizResultante("O resultado da multiplicação das matrizes é:", resultado);
    }

    private static int tamanho(String A) {
        String S = JOptionPane.showInputDialog(null, A);
        return Integer.parseInt(S);
    }

    private static float[][] matriz(String mensagem, int linhas, int colunas) {
        float[][] matriz = new float[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String input = JOptionPane.showInputDialog(null, mensagem + "\nElemento [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = Float.parseFloat(input);
            }
        }
        return matriz;
    }
    private static float[][] multiplicaoMatriz(float[][] matrizA, float[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizB[0].length;
        int tamanho = matrizA[0].length;
        float[][] resultado = new float[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < tamanho; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
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
