package Clases;
public class Vuelo {
    String numeroVuelo;
    String destino;
    String origen;
    int asientosDisponibles;


    public Vuelo(String numeroVuelo, String destino, String origen, int asientosDisponibles, String reservaDeVuelo, String cancelarReserva) {
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
        this.origen = origen;
        this.asientosDisponibles = asientosDisponibles;
        
    }
    public void mostrarInformacion (){
        System.out.println("El numero de vuelo es: "+numeroVuelo);
        System.out.println("El destino es: "+destino);
        System.out.println("El origen es: "+origen);
        System.out.println("Los asientos disponibles son: "+asientosDisponibles);
       
    }
    public void reservaVuelo(){
        System.out.println("Su vuelo se reservo con exito"+numeroVuelo);
        
    }
    public void cancelarVuelo(){
        System.out.println("Su veulo fue cancelado"+numeroVuelo);
    }
    
    public static void main(String[] args) {
        Vuelo v2 = new Vuelo("aasd22", "cordoba", "Buenos Aires", 17);
        v2.reservaDeVuelo = "Su vuelo fue reservado";
        v2.cancelarReserva = "Su vuelo fue cancelado";
        v2.mostrarInformacion();
    }
        
}

