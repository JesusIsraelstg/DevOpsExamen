import java.util.*;
import java.time.*;

public class Main
{
    // Este es el cambio 
    public static String SubMenu(){
	    String subopcion;
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" 4. Menu \n 5. Salir");
	    System.out.println("Introduzca opción seleccionada");
	    do{
	        subopcion = sc.nextLine();
	        if (subopcion.equals("4") || subopcion.equals("5")){
	            return subopcion;
	        }
	        else {
	            System.out.println("Introduzca una opcion valida");
	        }
	    }while(!(subopcion.equals("4")) || !(subopcion.equals("5")));
	    return subopcion;
	}
    
	public static void main(String[] args) {
	    float Saldo = 1000, cantidad;
	    int i=0;
	    ArrayList<String> Historico = new ArrayList<String>();
        String Contraseña = "1235",contraseña, subopcion = "4";
        
		while(i<3){
	       Scanner sc = new Scanner(System.in);
		   System.out.print("Introducir contraseña");
	   	   contraseña = sc.nextLine();
	   	   if(contraseña.equals(Contraseña)) {
	   	       while(subopcion.equals("4")){
	   	           System.out.println("\t Bienvenido: \n Jesus Israel Santiago Osorio \n\n 1. Consultar saldo \n 2. Retirar saldo\n 3. Histórico de Movimientos\n");
		           System.out.print("Introduzca la opcion deseada:");
		           int opcion = sc.nextInt();
		           if (opcion == 1){
		                System.out.println("Su saldo es: " + Saldo);
		                subopcion = SubMenu();
		           }     
		           else if (opcion == 2){
		                System.out.print("Saldo a retirar:");
		                cantidad = sc.nextFloat();
		                if (cantidad <= Saldo){
		                    Saldo = Saldo - cantidad;
		                    System.out.println("Su nuevo saldo es: " + Saldo);
		                    Historico.add("\nFecha: " + LocalDate.now(ZoneId.of("America/Mexico_City")) 
		                    + "\nHora: " + LocalTime.now(ZoneId.of("America/Mexico_City")) +"\nSaldo a retirar: " 
		                    + String.valueOf(cantidad) + "\nSaldo anterior: " + String.valueOf(Saldo));
		                    subopcion = SubMenu();
		                }     
		                else{
		                    System.out.println("Saldo insuficinte, ingrese otro monto:");
		                    subopcion = SubMenu();
		                }
		           }
		           else if (opcion == 3){
		                for (int n = 0;n<Historico.size();n++){
		                    System.out.println("\nSus movimientos son: " + Historico.get(n) +"\n");
		                }
		                subopcion = SubMenu();
		           }
	   	       }
	   	       break;
		  }
		  else {
		      i = i + 1;
		      System.out.println("Contraseña no valida");
		  }
		}
	}
}
