package parcial.controlador;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import parcial.entidades.Usuario;
import parcial.repositorio.IUsuarioCRUD;

@RestController
@RequestMapping("/")
public class UsuarioControl {

	@Autowired
	private IUsuarioCRUD crud;
	
	@RequestMapping(value ="/agregarUsuario", method = RequestMethod.GET)
	public void agregar(
			@RequestParam Long id,
			@RequestParam String nombre,
			@RequestParam String apellido,
			@RequestParam Integer telefono,
			@RequestParam String sexo,
			@RequestParam String estado, HttpServletResponse response ) throws IOException {
		
		Usuario usuario = new Usuario(id, nombre, apellido, telefono, sexo, estado);
		
		crud.save(usuario);
		
		response.sendRedirect("/usuarios");
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> listar(){
		return (List<Usuario>) crud.findAll();		
	}
	
	@GetMapping("/consultar/{id}")
	public Optional<Usuario> consultar(@PathVariable(value = "id") Long id) {
		return crud.findById(id);
	}
	
	@GetMapping("/borrar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		crud.deleteById(id);
		return "eliminado";
	}
	
	
}
