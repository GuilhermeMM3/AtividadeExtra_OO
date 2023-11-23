import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		float resultado = 0;
		String entrada1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String entrada2 = JOptionPane.showInputDialog("Digite o segundo número:");
        float numero1 = Float.parseFloat(entrada1);
        float numero2 = Float.parseFloat(entrada2);
        String escolhas = JOptionPane.showInputDialog("Escolha a operação:\n" + "1. Adição\n" + "2. Subtração\n" + "3. Multiplicação\n" + "4. Divisão");
        int opcao = Integer.parseInt(escolhas);
        switch (opcao) {
        case 1:
            resultado = numero1 + numero2;
            break;
        case 2:
            resultado = numero1 - numero2;
            break;
        case 3:
            resultado = numero1 * numero2;
            break;
        case 4:
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
            }
            break;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
	}
}
