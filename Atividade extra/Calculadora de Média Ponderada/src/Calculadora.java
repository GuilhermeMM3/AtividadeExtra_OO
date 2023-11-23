
import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
        String notaDisciplina1 = JOptionPane.showInputDialog("Digite a nota da disciplina 1:");
        String pesoDisciplina1 = JOptionPane.showInputDialog("Digite o peso da disciplina 1:");
        String notaDisciplina2 = JOptionPane.showInputDialog("Digite a nota da disciplina 2:");
        String pesoDisciplina2 = JOptionPane.showInputDialog("Digite o peso da disciplina 2:");
        String notaDisciplina3 = JOptionPane.showInputDialog("Digite a nota da disciplina 3:");
        String pesoDisciplina3 = JOptionPane.showInputDialog("Digite o peso da disciplina 3:");
        float nota1 = Float.parseFloat(notaDisciplina1);
        float peso1 = Float.parseFloat(pesoDisciplina1);
        float nota2 = Float.parseFloat(notaDisciplina2);
        float peso2 = Float.parseFloat(pesoDisciplina2);
        float nota3 = Float.parseFloat(notaDisciplina3);
        float peso3 = Float.parseFloat(pesoDisciplina3);
        float mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        JOptionPane.showMessageDialog(null, "A média ponderada é: " + String.format("%.2f", mediaPonderada));

	}

}
