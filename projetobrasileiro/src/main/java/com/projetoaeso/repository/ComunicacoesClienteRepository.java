package com.projetoaeso.repository;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetoaeso.model.*;

@Repository
public interface ComunicacoesClienteRepository extends JpaRepository<ComunicacoesCliente, Long>{

}
