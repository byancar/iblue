package br.com.iblueconsulting.clientes.dao;

import java.util.List;
import br.com.iblueconsulting.clientes.model.Cliente;

public interface IClienteDao {

    public List<Cliente> findAll();

    public boolean save(Cliente c);

    public Cliente find(Long id);
    public Cliente find(String email);

    public boolean update(Cliente c, Long id);

    public boolean delete(Long id);

	
}