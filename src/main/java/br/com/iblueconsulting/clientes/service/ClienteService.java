package br.com.iblueconsulting.clientes.service;

import java.util.List;

import javax.inject.Inject;

import br.com.iblueconsulting.clientes.dao.IClienteDao;
import br.com.iblueconsulting.clientes.model.Cliente;

public class ClienteService implements IClienteService {
    
    @Inject
    private IClienteDao clienteDao;

    @Override
    public List<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Override
    public boolean save(Cliente c) {
        return clienteDao.save(c);
    }

    @Override
    public Cliente find(Long id) {  
        return clienteDao.find(id);
    }

    @Override
    public boolean update(Cliente c, Long id) {
        return clienteDao.update(c, id);
    }

    @Override
    public boolean delete(Long id) {
        return clienteDao.delete(id);
    }
}