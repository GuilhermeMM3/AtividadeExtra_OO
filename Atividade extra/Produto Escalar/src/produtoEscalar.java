import javax.swing.JOptionPane;

public class produtoEscalar {
    public static void main(String[] args) {
        int tamanhoVetores = tamanho();
        float[] vetor1 = elementos("Digite os elementos do primeiro vetor:", tamanhoVetores);
        float[] vetor2 = elementos("Digite os elementos do segundo vetor:", tamanhoVetores);
        float produtoEscalar = produto(vetor1, vetor2);
        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + produtoEscalar);
    }

    private static int tamanho() {
        String tam = JOptionPane.showInputDialog(null, "Digite o tamanho dos vetores:");
        return Integer.parseInt(tam);
    }
    private static float[] elementos(String A, int tamanho) {
        float[] vetor = new float[tamanho];

        for (int i = 0; i < tamanho; i++) {
            String B = JOptionPane.showInputDialog(null, A);
            vetor[i] = Float.parseFloat(B);
        }
        return vetor;
    }
    private static float produto(float[] vetor1, float[] vetor2) {
        float produto = 0;
        for (int i = 0; i < vetor1.length; i++) {
            produto += vetor1[i] * vetor2[i];
        }
        return produto;
    }
}