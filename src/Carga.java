public class Carga extends Veiculo {
    private int cargaMax;
    private int tara;

    public Carga() {
        super();
        this.cargaMax = 0;
        this.tara = 0;
    }

    public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor, int cargaMax) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.cargaMax = cargaMax;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCarga maxima do veiculo: " + cargaMax + "\n"
        + "Tara: " + tara;
    }

    @Override
    public float calcVel(float velocMax) {
        float velocidadeCentimetrosPorHora = velocMax * 10000 / 3600;
        return velocidadeCentimetrosPorHora;
    }
}
