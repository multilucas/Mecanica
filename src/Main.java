import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Uso de Array List para instanciar cada veiculo criado;
        List<Carga> meuVeiculoDeCarga = new ArrayList<>();
       List<Passeio> meuVeiculoDePasseio = new ArrayList<>();

        //Quantidade de veiculos de carga serem preenchidos;
        for (int i = 0; i < 5; i++) {
            System.out.println("VEICULO CARGA");
            System.out.print("Digite a placa do veiculo: ");
            String placa = sc.nextLine();
            System.out.print("Digite a marca do veiculo: ");
            String marca = sc.nextLine();
            System.out.print("Digite o modelo do veiculo: ");
            String modelo = sc.nextLine();
            System.out.print("Digite a cor do veiculo: ");
            String cor = sc.nextLine();
            System.out.print("Digite a velocidade maxima do veiculo: ");
            float velocMaxima = sc.nextFloat();
            sc.nextLine();
            System.out.print("Digite a quantidade de rodas do veiculo: ");
            int qtdRodas = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite a quantidade de pistões do veículo: ");
            int qtdPist = sc.nextInt();
            System.out.print("Digite a potencia do veículo: ");
            int potencia = sc.nextInt();
            System.out.print("Digite a carga maxima do veículo: ");
            int cargaMax = sc.nextInt();
            sc.nextLine();
            meuVeiculoDeCarga.add(new Carga(placa, marca, modelo, cor, velocMaxima, qtdRodas, new Motor(qtdPist, potencia), cargaMax));
        }


        //Quantidade de veiculos de passeio serem preenchidos;
        for (int i = 0; i < 5; i++) {
            System.out.println("VEICULO PASSEIO");
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
            System.out.print("Digite a quantidade de passageiros do veículo: ");
            int qtdPassageiros = sc.nextInt();
            sc.nextLine();
            meuVeiculoDePasseio.add(new Passeio(placa, marca, modelo, cor, velMaxima, qtdRodas, new Motor(qtdPist, potencia), qtdPassageiros));
        }





        int n = 1;
        for (Carga veiculo: meuVeiculoDeCarga
             ) {
            System.out.println("=============== VEICULO CARGA =================");
            System.out.println();
            System.out.println("Veiculo de Carga: " + n);
            System.out.println(veiculo.toString());
            n++;
            System.out.println();
            System.out.println("===============================================");
        }

        int a = 1;
        for (Passeio veiculo: meuVeiculoDePasseio
             ) {
            System.out.println("=============== VEICULO CARGA =================");
            System.out.println("Veiculo de Carga: " + a);
            System.out.println(veiculo.toString());
            n++;
            System.out.println();
            System.out.println("===============================================");
        }
        sc.close();
    }
}