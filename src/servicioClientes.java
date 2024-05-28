import java.util.TreeSet;

public interface servicioClientes {
    abstract public boolean agregarCliente(Cliente cliente);
    abstract public boolean eliminarCliente(int numero);
    abstract public Cliente consultaCliente(int numero);
    abstract public TreeSet<Cliente> obtenerClientes();
    abstract public Cliente buscarClientePorRFC(String rfc);
}
