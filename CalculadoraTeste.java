public class CalculadoraTeste {

    public static void main(String[] args) {
         Calculadora calc = new Calculadora();
        // testar soma
        double soma = calc.somar(97, 3);
        System.out.println(soma);
    }
    public double subtrair(double a, double b){
        return a - b;
    }
}