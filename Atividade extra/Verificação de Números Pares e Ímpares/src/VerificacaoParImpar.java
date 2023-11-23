import javax.swing.JOptionPane;

public class VerificacaoParImpar {

	public static void main(String[] args) {
		String numeros = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(numeros);
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
	}
}
