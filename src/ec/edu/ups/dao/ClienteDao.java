package ec.edu.ups.dao;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.dao.IClienteDao;

public class ClienteDao implements IClienteDao {

    //lista de tipo cliente
    List<Cliente> clientes;

    //inicializar los objetos cliente y añadirlos a la lista
    public ClienteDao() {
        clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente(0, "Jose", "Molina");
        Cliente cliente2 = new Cliente(1, "Manuel", "Chordeleg");
        clientes.add(cliente1);
        clientes.add(cliente2);
    }

    //obtener todos los clientes
    @Override
    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    //obtener clientes por la id
    @Override
    public Cliente obtenerClientes(int id) {
        return clientes.get(id);
    }

    //actualizar el cliente
    @Override
    public void actualizarCliente(Cliente cliente) {
        clientes.get(cliente.getId()).setNombre(cliente.getNombre());
        clientes.get(cliente.getId()).setApellido(cliente.getApellido());
        System.out.println("Cliente con id: " + cliente.getId() + " actualizado satisfactoriamente");
    }

    //eliminar el cliente por la id
    @Override
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente.getId());
        System.out.println("Cliente con la id: " + cliente.getId() + " eliminado satisfactoriamente");
    }

}
