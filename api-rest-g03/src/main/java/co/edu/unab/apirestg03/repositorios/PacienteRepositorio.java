package co.edu.unab.apirestg03.repositorios;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.apirestg03.modelos.PacienteModelo;
@Repository
public interface PacienteRepositorio extends MongoRepository<PacienteModelo, String> {
    
    List<PacienteModelo> findByApellido(String apellido); //keywords for query methods
}
