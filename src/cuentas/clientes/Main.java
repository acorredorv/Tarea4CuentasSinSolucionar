package cuentas.clientes;
/**
 * Clase principal que inicia la aplicación.
 * <p>
 * Contiene el método main que sirve como punto de entrada
 * para la ejecución del programa.
 * </p>
 * 
 * @author Aleex
 * @version 1.0
 */ 

public class Main {
    public Main() {
        // Constructor vacío
    }

    public static void main(String[] args, float cantidad) {
        Cuenta cuenta1 = new Cuenta("Rafael Nadal Parera", "1000-2365-85-1230456789", 2500.0, 0.0);
        
        operativa_cuenta(cuenta1, 2500);
    }

	/**
	 * @param cuenta1
	 * @param f 
	 */
	private static void operativa_cuenta(Cuenta cuenta1, float f) {
		System.out.println("El saldo actual es: " + cuenta1.estado());
        
        try {
            cuenta1.retirar(2300.0);
            System.out.println("El saldo actual es: " + cuenta1.estado());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        System.out.println("Ingreso en cuenta");
        try {
            cuenta1.ingresar(695.0);
            System.out.println("El saldo actual es: " + cuenta1.estado());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
