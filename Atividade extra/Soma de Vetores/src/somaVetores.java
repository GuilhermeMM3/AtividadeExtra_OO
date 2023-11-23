import javax.swing.JOptionPane;

public class somaVetores {
    public static void main(String[] args) {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));
        int[] vetorA = new int[tam];
        int[] vetorB = new int[tam];
        for (int i = 0; i < tam; i++) {
            vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do primeiro vetor:"));
        }
        for (int i = 0; i < tam; i++) {
            vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do segundo vetor:"));
        }
        int[] resultado = new int[tam];
        for (int i = 0; i < tam; i++) {
            resultado[i] = vetorA[i] + vetorB[i];
        }
        StringBuilder mensagem = new StringBuilder("A soma dos vetores é: [");
        for (int i = 0; i < tam; i++) {
            mensagem.append(resultado[i]);
            if (i < tam - 1) {
                mensagem.append(", ");
            }
        }
        mensagem.append("]");
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
