public class Main {
    public static void main(String[] args) {
        System.out.println("-------SIN PARAMETROS--------");
        Auto auto1 = new Auto();
        auto1.prenderRadio();
        auto1.mostrarDatos();
        System.out.println("-------PADRE E HIJO--------");
        Auto auto2 = new Auto(5,60.0,"Gaolina",80);
        auto2.prenderRadio();
        auto2.mostrarDatos();
        System.out.println("-------CON PARAMETROS PADRE--------");
        Auto auto3 = new Auto(6,100);
        auto3.prenderRadio();
        auto3.mostrarDatos();
        System.out.println("-------SOLO HIJO Y DESPUES SETEO--------");
        Auto auto4 = new Auto("Diesel",2000);
        auto4.setCapacidad();
        auto4.setVelocidad();
        auto4.prenderRadio();
        auto4.mostrarDatos();
    }
}