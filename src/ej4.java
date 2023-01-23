public class ej4 {
    public static void main(String[] args) {
        //CLIENTE
        Cliente cliente = new Cliente();
        cliente.edad = 33;
        cliente.nombre = "Roberto";
        cliente.telefono = "+591-70399764";
        cliente.credito = 1500;

        //TRABAJADOR
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 34;
        trabajador.nombre = "Mariano";
        trabajador.telefono = "+54-1168184259";
        trabajador.salario = 3400;

        //CLiente
        System.out.println("El nombre del cliente es: " +cliente.nombre);
        System.out.println("La edad del cliente es: " +cliente.edad);
        System.out.println("El telefono del cliente es: " +cliente.telefono);
        System.out.println("El credito del cliente es: USD " +cliente.credito);
        //Trabajador
        System.out.println(" ");
        System.out.println("El nombre del trabajador es: " +trabajador.nombre);
        System.out.println("La edad del trabajador es: " +trabajador.edad);
        System.out.println("El telefono del trabajador es: " +trabajador.telefono);
        System.out.println("El salario del trabajador es: USD " +trabajador.salario);
    }
}
class Persona{
    int edad;
    String nombre;
    String telefono;
}
    final class Cliente extends Persona{
       int credito;
    }
    final class Trabajador extends Persona{
       int salario;
    }