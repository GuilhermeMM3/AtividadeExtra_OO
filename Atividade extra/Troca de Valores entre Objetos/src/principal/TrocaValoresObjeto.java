package principal;
import javax.swing.JOptionPane;
import atributo.Ponto;

public class TrocaValoresObjeto {
    public static void main(String[] args) {
        Ponto ponto1 = Pontos("Digite o valor de x para o Ponto 1:");
        Ponto ponto2 = Pontos("Digite o valor de x para o Ponto 2:");

        imprimir("Valores originais:", ponto1, ponto2);
        troca(ponto1, ponto2);
        imprimir("Valores após a troca:", ponto1, ponto2);
    }

    private static Ponto Pontos(String A) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, A));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de y:"));
        return new Ponto(x, y);
    }
    private static void troca(Ponto ponto1, Ponto ponto2) {
        int tempX = ponto1.getX();
        int tempY = ponto1.getY();
        ponto1.setX(ponto2.getX());
        ponto1.setY(ponto2.getY());
        ponto2.setX(tempX);
        ponto2.setY(tempY);
    }
    private static void imprimir(String A, Ponto ponto1, Ponto ponto2) {
        JOptionPane.showMessageDialog(null, A + "\nPonto 1: (" + ponto1.getX() + ", " + ponto1.getY() + ")" +
        		"\nPonto 2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");
    }
}
