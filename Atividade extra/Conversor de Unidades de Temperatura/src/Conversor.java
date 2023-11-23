import javax.swing.JOptionPane;
public class Conversor {

	public static void main(String[] args) {
		float resultado;
        String inicio;
        String fim ;
        String escolha = JOptionPane.showInputDialog("Escolha o tipo de conversão:\n1. Celsius para Fahrenheit\n2. Fahrenheit para Celsius");
        int opcao = Integer.parseInt(escolha);

        switch (opcao) {
            case 1:
                String entradaCelsius = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
                float temperatura1 = Float.parseFloat(entradaCelsius);
                resultado = celsiusParaFahrenheit(temperatura1);
                inicio = "Celsius";
                fim = "Fahrenheit";
                JOptionPane.showMessageDialog(null, temperatura1 + " " + inicio + " é igual a " + resultado + " " + fim);
                break;
            case 2:
            	String entradaFahrenheit = JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit:");
            	float temperatura2 = Float.parseFloat(entradaFahrenheit);
                resultado = fahrenheitParaCelsius(temperatura2);
                inicio = "Fahrenheit";
                fim = "Celsius";
                JOptionPane.showMessageDialog(null, temperatura2 + " " + inicio + " é igual a " + resultado + " " + fim);
                break;
        }

    }
    private static float celsiusParaFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }
    private static float fahrenheitParaCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}


