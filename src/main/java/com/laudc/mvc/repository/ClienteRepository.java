package com.laudc.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laudc.mvc.entity.Cliente;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNombreAndApellidos(String nombre, String apellidos);
	Optional<Cliente> findFirstByDni(String dni);
	
}
