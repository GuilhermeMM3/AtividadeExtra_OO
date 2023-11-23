import javax.swing.JOptionPane;
public class Calculadora {

	public static void main(String[] args) {
        String Massa = JOptionPane.showInputDialog("Digite seu peso em kg:");
        float peso = Float.parseFloat(Massa);
        String Altura = JOptionPane.showInputDialog("Digite sua altura em metros:");
        float altura = Float.parseFloat(Altura);
        float imc = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + String.format("%.2f", imc)  +
                "\nClassificação de IMC: " + classificaoIMC(imc));
    }

    private static String classificaoIMC(float imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau 1";
        } else if (imc < 40) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        } 

	}

}
