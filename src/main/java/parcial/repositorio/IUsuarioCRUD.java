package parcial.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import parcial.entidades.Usuario;

@Repository
public interface IUsuarioCRUD extends CrudRepository<Usuario, Long>{

}
