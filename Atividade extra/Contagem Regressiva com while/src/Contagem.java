import javax.swing.JOptionPane;
public class Contagem {

	public static void main(String[] args) {
        int contador;
		 String numeroInicial = JOptionPane.showInputDialog("Digite um número inicial: ");
		 int numero = Integer.parseInt(numeroInicial);
		 contador = numero;
	        while (contador >= 1) {
	            JOptionPane.showMessageDialog(null, contador);
	            contador--;
	        }
	}
}
