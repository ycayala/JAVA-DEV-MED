import java.util.ArrayList;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creacion de cuentas
        CuentaDeAhorro cuentaDeAhorro001 = new CuentaDeAhorro(47654654, 50000, 2);
        CuentaDeAhorro cuentaDeAhorro002 = new CuentaDeAhorro(87925844, 100000, 2.5);
        CuentaDeCheque cuentaDeCheque001 = new CuentaDeCheque(93145545, 300000, 1.5);
        CuentaDeCheque cuentaDeCheque002 = new CuentaDeCheque(14752668, 540000, 0.5);



        //Creacion de domicilios
        Domicilio domicilioJulian = new Domicilio("45A", 1254, "Poblado", "Antioquia", 50001);
        Domicilio domicilioMaria = new Domicilio("12C", 9874, "Bello", "Antioquia", 50001);
        Domicilio domicilioBancolombia = new Domicilio("Norte", 7614, "Industriales", "Antioquia", 50001);

        //Creacion de Clientes
        Cliente julian = new Cliente(78542215, "Julian Francisco Pinilla", domicilioJulian, "asdf", "123456789", "20000101");
        Cliente maria = new Cliente(35715945, "Ana Maria Henao", domicilioMaria, "zxcv", "987456321", "19861201");

        //Crear lista de clientes
        ArrayList<Cuenta> cuentasJulian = new ArrayList<Cuenta>();
        ArrayList<Cuenta> cuentasMaria = new ArrayList<Cuenta>();

        //Crear Lista de clientes
        TreeSet<Cliente> clientes = new TreeSet<Cliente>();


        //agregar cuentas a clientes
        julian.setCuentas(cuentasJulian);
        maria.setCuentas(cuentasMaria);

        //Creacion de Banco
        Banco bancolombia = new Banco("Bancolombia", domicilioBancolombia, "uytre", "147258369");
        bancolombia.setClientes(clientes);

        System.out.println(bancolombia.toString());
        bancolombia.agregarCliente(julian);
        bancolombia.agregarCliente(maria);
        bancolombia.consultaCliente(78542215).agregarCuenta(cuentaDeCheque001);
        bancolombia.consultaCliente(78542215).agregarCuenta(cuentaDeAhorro002);
        bancolombia.consultaCliente(35715945).agregarCuenta(cuentaDeCheque002);
        bancolombia.consultaCliente(35715945).agregarCuenta(cuentaDeAhorro001);
        bancolombia.consultaCliente(78542215).abonarCuenta(87925844, 20000);
        bancolombia.consultaCliente(78542215).retirar(87925844, 50000);

        //bancolombia.eliminarCliente(35715945);


        System.out.println("*********************************************");
        System.out.println(bancolombia.consultaCliente(35715945));
        System.out.println(bancolombia.buscarClientePorRFC("asdqw"));
        //System.out.println(bancolombia.toString());


        System.out.println(bancolombia.consultaCliente(78542215).compareTo(maria));
        System.out.println(bancolombia.consultaCliente(35715945).compareTo(maria));

        System.out.println(bancolombia.consultaCliente(35715945).getCuentas().get(1).compareTo(cuentaDeAhorro002));

    }
}