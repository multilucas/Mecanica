import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Uso de Array List para instanciar cada veiculo criado;
        List<Veiculo> meuVeiculo = new ArrayList<>();

        //Quantidade de objetos a serem instanciados;
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite a placa do veiculo: ");
            String placa = sc.nextLine();
            System.out.print("Digite a marca do veiculo: ");
            String marca = sc.nextLine();
            System.out.print("Digite o modelo do veiculo: ");
            String modelo = sc.nextLine();
            System.out.print("Digite a cor do veiculo: ");
            String cor = sc.nextLine();
            System.out.print("Digite a velocidade maxima do veiculo: ");
            float velMaxima = sc.nextFloat();
            sc.nextLine();
            System.out.print("Digite a quantidade de rodas do veiculo: ");
            int qtdRodas = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite a quantidade de pistões do veículo: ");
            int qtdPist = sc.nextInt();
            System.out.print("Digite a potencia do veículo: ");
            int potencia = sc.nextInt();
            sc.nextLine();
            meuVeiculo.add(new Veiculo(placa, marca, modelo, cor, velMaxima, qtdRodas, new Motor(qtdPist, potencia)));
        }

        int n = 1;
        for (Veiculo veiculo: meuVeiculo
             ) {
            System.out.println("Veiculo: " + n);
            System.out.println(veiculo.toString());
            n++;
            System.out.println();
        }

    }
}