import javax.swing.JOptionPane;
import java.util.Random;
public class NumerosComDoWhile {

	public static void main(String[] args) {
		int Tentativa = 0, palpite;
		Random random = new Random();
		int numeroAleatorio = random.nextInt(10) + 1;
        JOptionPane.showMessageDialog(null, "Adivinhe o número entre 1 e 10.");
        do {
            String chute = JOptionPane.showInputDialog("Tentativa " + (Tentativa+1) + ": ");
            palpite = Integer.parseInt(chute);
            Tentativa++;
            if (palpite == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + numeroAleatorio + " em " + Tentativa + " tentativas.");
            } else if(palpite > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Tente novamente. O número é menor");
            } else {
                JOptionPane.showMessageDialog(null, "Tente novamente. O número é maior");
            }
        } while (palpite != numeroAleatorio);
	}
}
