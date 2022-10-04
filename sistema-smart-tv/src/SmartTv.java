public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    boolean controleParental = true;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void ativarControleParental() {
        controleParental = true;
    }

    public void desativarControleParental() {
        controleParental = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void subirCanal() {
        canal++;
    }

    public void descerCanal() {
        canal--;
    }

}
