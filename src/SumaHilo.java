public class SumaHilo extends Thread{

    private int identificadorHilo;
    private int [] calificaciones;
    private int inicio;
    private int fin;
    private int sumaTotal;

    public SumaHilo(int nombreHilo ,int[] numeros, int inicio, int fin) {
        this.identificadorHilo = nombreHilo;
        this.calificaciones = numeros;
        this.inicio = inicio;
        this.fin = fin;
        this.sumaTotal = 0;
    }

    public int getIdentificadorHilo() {
        return identificadorHilo;
    }

    public void setIdentificadorHilo(int identificadorHilo) {
        this.identificadorHilo = identificadorHilo;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(int resultado) {
        this.sumaTotal = resultado;
    }

    @Override
    public void run() {

        int suma = 0;
        int totalCalificaciones = 0;

        for (int i = inicio; i < fin; i++) {
            suma += calificaciones[i];
            totalCalificaciones += 1;
        }

        System.out.println("El hilo " + this.identificadorHilo + " que empezó en el índice " + this.inicio +
                " y ha contado " + totalCalificaciones  + " calificaciones, ha sumado un total de: " + suma);

        this.sumaTotal = suma;
    }
}
