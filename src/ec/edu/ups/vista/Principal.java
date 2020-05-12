package ec.edu.ups.vista;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.dao.ClienteDao;
import ec.edu.ups.dao.IClienteDao;

public class Principal {

    public static void main(String[] args) {
        //objeto para manipular el dao
        IClienteDao clienteDao = new ClienteDao();

        //imprimir los clientes
        clienteDao.obtenerClientes().forEach(System.out::println);

        //obtener un cliente
        Cliente cliente = clienteDao.obtenerClientes(1);
        cliente.setNombre("Esteban");
        cliente.setApellido("Pardo");

        //actualizar cliente
        clienteDao.actualizarCliente(cliente);

        //imprimir los clientes
        System.out.println("****");
        clienteDao.obtenerClientes().forEach(System.out::println);
 System.out.println("hola mundo");
    }

}
