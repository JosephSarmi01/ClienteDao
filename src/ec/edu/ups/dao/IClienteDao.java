
package ec.edu.ups.dao;

import java.util.List;
import ec.edu.ups.modelo.Cliente;

public interface IClienteDao {
    
    public List<Cliente> obtenerClientes();
    public Cliente obtenerClientes(int id);
    public void actualizarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
}
