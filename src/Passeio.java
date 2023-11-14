public class Passeio extends Veiculo{
    private int qtdPassageiros;

    
    public Passeio() {
        super();
        this.qtdPassageiros = 0;
    }



    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor,
            int qtdPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.qtdPassageiros = qtdPassageiros;
    }



    public int getQtdPassageiros() {
        return qtdPassageiros;
    }
    
    
    
    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }



    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de passageiros: " + qtdPassageiros;
    }



    @Override
    public float calcVel(float velocMax) {
        float velocidadeMetrosPorHora = velocMax * 1000 / 3600;
        return velocidadeMetrosPorHora;
    }
}
