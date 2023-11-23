import javax.swing.JOptionPane;

public class transposicaoMatriz {
    public static void main(String[] args) {
        int linhas = tamanho("Digite o número de linhas:");
        int colunas = tamanho("Digite o número de colunas:");
        float[][] matriz = matriz("Digite os elementos da matriz:", linhas, colunas);
        float[][] transposta = trasporMatriz(matriz);
        matrizTransposta("A matriz transposta é:", transposta);
    }

    private static int tamanho(String A) {
        String B = JOptionPane.showInputDialog(null, A);
        return Integer.parseInt(B);
    }
    private static float[][] matriz(String A, int linhas, int colunas) {
        float[][] matriz = new float[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String B = JOptionPane.showInputDialog(null, A + "\n [" + (i + 1) + "][" + (j + 1) + "]");
                matriz[i][j] = Float.parseFloat(B);
            }
        }
        return matriz;
    }
    private static float[][] trasporMatriz(float[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        float[][] A = new float[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                A[j][i] = matriz[i][j];
            }
        }
        return A;
    }

    private static void matrizTransposta(String A, float[][] matriz) {
        StringBuilder resultado = new StringBuilder(A + "\n");
        for (float[] linha : matriz) {
            for (float B : linha) {
            	resultado.append(B).append(" ");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
