import java.util.Scanner;

public class mainimc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso = 0.0, altura = 0.0, imc = 0.0;
        String resultado = " ", nome = " ";

        System.out.println("|-----------------------------------------|");
        System.out.println("|Programa para calcular o IMC do paciente |");
        System.out.println("|Digite o nome do paciente: ");
        nome = sc.nextLine();
        System.out.println("|Digite o peso do paciente: ");
        peso = sc.nextDouble();
        System.out.println("|Digite a altura do paciente: ");
        altura = sc.nextDouble();

        imc = IMC.calcularImc(peso, altura);
        resultado = IMC.classificarImc(imc);

        System.out.printf("O paciente %s tem um IMC = %.2f \n" ,nome, imc);
        System.out.printf("A classificação do IMC é: %s \n" ,resultado);
    }
}
