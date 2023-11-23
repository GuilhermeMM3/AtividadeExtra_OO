import javax.swing.JOptionPane;
public class CalculadoraGorjeta {

	public static void main(String[] args) {
		String Conta = JOptionPane.showInputDialog("Digite o valor total da conta : ") ;
		float valorConta= Float.parseFloat(Conta);
		String Gorjeta = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar: ");
		int percentualGorjeta = Integer.parseInt(Gorjeta);
		float valorGorjeta = valorConta * percentualGorjeta /100;
		String ValorGorjeta = String.format("%.2f", valorGorjeta);
		JOptionPane.showMessageDialog(null, "valor da gorjeta: $"+ValorGorjeta);
		float total = valorConta + valorGorjeta;
		String Total = String.format("%.2f", total);
		JOptionPane.showMessageDialog(null, "Total a ser pago: "+"$"+Total);	
	}

}
