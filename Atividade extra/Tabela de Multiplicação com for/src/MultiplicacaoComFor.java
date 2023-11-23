import javax.swing.JOptionPane;

public class MultiplicacaoComFor {

	public static void main(String[] args) {
        String inserirNumero = JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação:");
        int numero = Integer.parseInt(inserirNumero);
        String tabelaMultiplicacao = "Tabela de multiplicação para " + numero + ":\n";
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabelaMultiplicacao += numero + " x " + i + " = " + resultado + "\n";
        }
        JOptionPane.showMessageDialog(null, tabelaMultiplicacao);

	}

}
