package com.BootCampGFT.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BootCampGFT.entidade.Usuario;

@RestController  //  diz que é um recurso web que é implementado por um controlado us 
@RequestMapping(value = "/usuarios") //nome do rercuso e o caminho dele
public class UsuarioRecurso {
	
	@GetMapping // para dizer que este metodo que responde requisição do tipo get 
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L,"Maria","maria@gmail.com","22222222","12345");
		//return ResponseEntity.ok().body(u);
		 return ResponseEntity.ok().body(u);
		
	}
}
