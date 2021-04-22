package br.com.iblueconsulting.clientes.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import br.com.iblueconsulting.clientes.model.Cliente;

public class ClienteDao implements IClienteDao {

    @Override
    public List<Cliente> findAll() {

        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriver(new org.h2.Driver());
        ds.setUrl("jdbc:h2:mem:testdb");

        List<Cliente> cities = new ArrayList<>();
        
        String query = "SELECT * FROM clientes;";

        try {
            JdbcTemplate jtm = new JdbcTemplate(ds);
            cities = jtm.query(query,
                    new BeanPropertyRowMapper(Cliente.class));
        } catch (DataAccessException dae) {
            Logger lgr = Logger.getLogger(ClienteDao.class.getName());
            lgr.log(Level.SEVERE, dae.getMessage(), dae);
        }

        return cities;
    }

    @Override
    public boolean save(Cliente c) {

        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriver(new org.h2.Driver());
        ds.setUrl("jdbc:h2:mem:testdb");

        String sql = "INSERT INTO clientes(nome, cpf) VALUES (?, ?)";

        boolean ret = true;

        try {
            JdbcTemplate jtm = new JdbcTemplate(ds);
            jtm.update(sql, new Object[]{c.getNome(),
                c.getCpf()});

        } catch (DataAccessException dae) {
            Logger lgr = Logger.getLogger(ClienteDao.class.getName());
            lgr.log(Level.SEVERE, dae.getMessage(), dae);

            ret = false;
        }

        return ret;
    }

    @Override
    public Cliente find(Long id) {

        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriver(new org.h2.Driver());
        ds.setUrl("jdbc:h2:mem:testdb");

        String sql = "SELECT * FROM cities WHERE Id=?";

        Cliente city = new Cliente();

        try {
            JdbcTemplate jtm = new JdbcTemplate(ds);
            city = (Cliente) jtm.queryForObject(sql, new Object[]{id},
                    new BeanPropertyRowMapper(Cliente.class));
        } catch (DataAccessException dae) {
            Logger lgr = Logger.getLogger(ClienteDao.class.getName());
            lgr.log(Level.SEVERE, dae.getMessage(), dae);
        }

        return city;
    }

    @Override
    public boolean update(Cliente c, Long id) {

        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriver(new org.h2.Driver());
        ds.setUrl("jdbc:h2:mem:testdb");

        boolean ret = true;

        String sql = "UPDATE clientes SET name=?, population=? WHERE Id=?";

        try {
            JdbcTemplate jtm = new JdbcTemplate(ds);
            int nOfRows = jtm.update(sql, new Object[]{c.getNome(),
                c.getCpf(), id});
            if (nOfRows != 1) {
                ret = false;
            }
        } catch (DataAccessException dae) {
            Logger lgr = Logger.getLogger(ClienteDao.class.getName());
            lgr.log(Level.SEVERE, dae.getMessage(), dae);
            ret = false;
        }

        return ret;
    }

    @Override
    public boolean delete(Long id) {

        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriver(new org.h2.Driver());
        ds.setUrl("jdbc:h2:mem:testdb");

        boolean ret = true;

        String sql = "DELETE FROM clientes WHERE Id=?";
        try {
            JdbcTemplate jtm = new JdbcTemplate(ds);
            int nOfRows = jtm.update(sql, new Object[]{id});
            if (nOfRows != 1) {
                ret = false;
            }
        } catch (DataAccessException dae) {
            Logger lgr = Logger.getLogger(ClienteDao.class.getName());
            lgr.log(Level.SEVERE, dae.getMessage(), dae);
            ret = false;
        }

        return ret;
    }
    
}