package spring.back.apirest.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.back.apirest.model.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente,Long> {

}
