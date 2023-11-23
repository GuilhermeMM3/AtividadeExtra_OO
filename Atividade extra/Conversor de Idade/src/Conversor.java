import javax.swing.JOptionPane;
public class Conversor {

	public static void main(String[] args) {
		String idade = JOptionPane.showInputDialog("Digite sua idade em anos:");
		int anos = Integer.parseInt(idade);
        int meses = anos * 12;
        int dias = anos * 365; 
        int horas = dias * 24;
        int minutos = horas * 60;		
        JOptionPane.showMessageDialog(null, "Idade em meses: " + meses +  "\nIdade em dias: " + dias +  "\nIdade em horas: " + horas +  "\nIdade em minutos: " + minutos );
		
		
	}

}
