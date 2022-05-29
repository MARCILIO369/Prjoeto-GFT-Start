package com.BootCampGFT.entidade;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable  {
	// como é serializable tem que ter um numero de serie
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private String email;
	private String phone;
	private String password;
	
	public Usuario() { 		}

	public Usuario(long id, String nome, String email, String phone, String password) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
	
	
	
}
