public class coche {
    private int puertas;

    public coche() {
        puertas = 0;
    }
    public coche(int puertas) {
        this.puertas = puertas;
    }

    public void puertas() {
        puertas += 1;
    }

    public int mostrarPuertas() {
        return puertas;
    }
}
