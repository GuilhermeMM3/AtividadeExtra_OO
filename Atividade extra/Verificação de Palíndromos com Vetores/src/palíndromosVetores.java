import javax.swing.JOptionPane;

public class palíndromosVetores {

	public static void main(String[] args) {
		int a=0;
        String palavraOriginal = JOptionPane.showInputDialog("Digite uma palavra: ");
        String palavra = palavraOriginal.replaceAll("\\s+", "").toLowerCase();
        int comprimento = palavra.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
            	 a= 0;
            	}
            else {
            	 a = 1;
            }
        }
       if(a==0) {
       	JOptionPane.showMessageDialog(null, "A palavra \"" + palavraOriginal + "\" não é um palíndromo.");
       }
       else {
       	JOptionPane.showMessageDialog(null, "A palavra \"" + palavraOriginal + "\"  é um palíndromo.");
       }
    }
}
