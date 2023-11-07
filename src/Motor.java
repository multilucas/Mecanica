public class Motor {
    private int qtdPist;
    private int potencia;

    public Motor() {
       qtdPist = 0;
       potencia = 0;
    }
    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    // Getters e Setters para cada atributo
    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return  "Quantidade de pistões: " + qtdPist + "\nPotencia: " + potencia;
    }
}