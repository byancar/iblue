package br.com.iblueconsulting.clientes.service;

import java.util.List;

import br.com.iblueconsulting.clientes.model.Cliente;

public interface IClienteService {
    
    public List<Cliente> findAll();

    public boolean save(Cliente c);

    public Cliente find(Long id);

    public boolean update(Cliente c, Long id);

    public boolean delete(Long id);
}
