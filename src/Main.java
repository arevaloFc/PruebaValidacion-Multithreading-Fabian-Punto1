import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args){
        final int TOTAL_CALIFICATIONS = 100000;
        int[] calificaciones = new int[TOTAL_CALIFICATIONS];
        double media = 0;

        for (int i = 0; i < TOTAL_CALIFICATIONS; i++) {
            int randomCalificaciones = (int) (Math.random() * 10);
            calificaciones[i] = randomCalificaciones;
        }

        SumaHilo hilo1 = new SumaHilo(1,calificaciones,0,10000);
        SumaHilo hilo2 = new SumaHilo(2,calificaciones,10000,20000);
        SumaHilo hilo3 = new SumaHilo(3,calificaciones,20000,30000);
        SumaHilo hilo4 = new SumaHilo(4,calificaciones,30000,40000);
        SumaHilo hilo5 = new SumaHilo(5,calificaciones,40000,50000);
        SumaHilo hilo6 = new SumaHilo(6,calificaciones,50000,60000);
        SumaHilo hilo7 = new SumaHilo(7,calificaciones,60000,70000);
        SumaHilo hilo8 = new SumaHilo(8,calificaciones,70000,80000);
        SumaHilo hilo9 = new SumaHilo(9,calificaciones,80000,90000);
        SumaHilo hilo10 = new SumaHilo(10,calificaciones,90000,100000);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();

        System.out.println("Todos los hilos han acabado su tarea");

        try {

            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
            hilo5.join();
            hilo6.join();
            hilo7.join();
            hilo8.join();
            hilo9.join();
            hilo10.join();

            double sumaHilo1 = hilo1.getSumaTotal();
            double sumaHilo2 = hilo2.getSumaTotal();
            double sumaHilo3 = hilo3.getSumaTotal();
            double sumaHilo4 = hilo4.getSumaTotal();
            double sumaHilo5 = hilo5.getSumaTotal();
            double sumaHilo6 = hilo6.getSumaTotal();
            double sumaHilo7 = hilo7.getSumaTotal();
            double sumaHilo8 = hilo8.getSumaTotal();
            double sumaHilo9 = hilo9.getSumaTotal();
            double sumaHilo10 = hilo10.getSumaTotal();

            media = (sumaHilo1 + sumaHilo2 + sumaHilo3 + sumaHilo4 + sumaHilo5
                    + sumaHilo6 + sumaHilo7 + sumaHilo8 + sumaHilo9 + sumaHilo10) / TOTAL_CALIFICATIONS;

            System.out.println("La media aritmética es de " + media);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
