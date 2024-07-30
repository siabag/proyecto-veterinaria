
package Hospital;

import Historial.DetalleClinico;
import Historial.HistorialClinico;
import consulta.Cliente;
import consulta.Consulta;
import consulta.Mascota;
import consulta.Veterinario;
import java.util.ArrayList;
import java.util.Scanner;


public class Hospital {
    
    static long cedula;
    static String nombre;
    static String apellido;
    static int edad;
    static String especialidad;
    static double sueldo;
    static int indice;
    static Cliente cliente;
    static Mascota mascota;
    static Veterinario veterinario;
    static Consulta consulta;
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Mascota> mascotas = new ArrayList<>();
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        ArrayList<Consulta> consultas = new ArrayList<>();
        ArrayList<DetalleClinico> detallesClinicos = new ArrayList<>();
        ArrayList<HistorialClinico> histotialesClinicos = new ArrayList<>();
        
        int opcion;
        do {
            System.out.println("----------Menu------------");
            System.out.println("1. Crear historial clinico");
            System.out.println("2. Coonsultar clientes");
            System.out.println("3. Listar todos los clientes");
            System.out.println("4. Salir del programa");
            
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    sc.nextLine();
                    System.out.println("Historial clinico de la mascota");
                    System.out.println("Numero de cedula del responsable: ");
                    cedula = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Nombre del responsable: ");
                    nombre = sc.nextLine();
                    System.out.println("Apellido del responsable: ");
                    apellido = sc.nextLine();
                    System.out.println("Edad del responsable: ");
                    edad = sc.nextInt();
                    clientes.add(new Cliente(cedula, nombre, apellido, edad));
                    //------------
                    sc.nextLine();
                    System.out.println("Datos de la mascota");
                    System.out.println("Id: ");
                    long idMascota = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Especie: ");
                    String especie = sc.nextLine();
                    System.out.println("Raza: ");
                    String raza = sc.nextLine();
                    System.out.println("Nombre: ");
                    String nomMascota = sc.nextLine();
                    mascotas.add(new Mascota(especie, raza, nomMascota, idMascota, clientes.get(clientes.size()-1)));
                    cliente = clientes.get(clientes.size()-1);
                    mascota = mascotas.get(mascotas.size()-1);
                    cliente.addMascota(mascota);
                    System.out.println("");
                    System.out.println("");
                    break;
                    
                case 2:
                    
                    System.out.println("------------------Listar clientes-----------------");
                    if(clientes.isEmpty()){
                        System.out.println("No tenemos clientes aun");
                        break;
                    }
                    System.out.println("Ingrese el indice del cliente que desea ver (0-"+(clientes.size()-1)+"): ");
                    indice = sc.nextInt();
                    if(indice < 0 || indice >= clientes.size()){
                        System.out.println("Indice invalido");
                        break;
                    }
                    cliente = clientes.get(indice);
                    System.out.println(cliente.toString());
                    break;
                    
                case 3:
                    System.out.println("-------------Listar todos los clientes--------------");
                    indice = 0;
                    for(Cliente cliente:clientes){
                        System.out.println("Cliente nuevo " + indice + "\n" + cliente);
                        indice++;
                    }
                    break;
                    
                case 4:
                    System.out.println("Saliendo de la aplicación");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Digito una opcion invalida");
            }
                    
            
            
        } while (opcion != 4);
        sc.close();
        
    }
}
