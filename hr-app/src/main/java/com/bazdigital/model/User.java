package com.bazdigital.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "clients")
public class User {

	private String id;
	private String username;
	private String password;
	private String nombre;
	private String segundoNombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String email;
	private String telefono;
	private String sexo;
	private String ocupacion;
	private String estadoCivil;
	private String rfc;
	private String nacionalidad;
	private String curp;
	private String fechaNaci;
	private String lugarNaci;
	private String imageUrl;

	private List<Domicilio> domicilio;

	private Role role;


	// protected constructor
	public User() {
		this.domicilio = new ArrayList<>();
		this.role = Role.ROLE_USER;
	}

	public User(String username, String password, String nombre, String segundoNombre, String apellidoPaterno,
			String apellidoMaterno, String email, String telefono, int edad,
			String sexo, String ocupacion, String estadoCivil, String rfc, String nacionalidad, String curp,
			String fechaNaci, String lugarNaci, String imageUrl, List<Domicilio> domicilio) {
		
		super();
		this.role = Role.ROLE_USER;
		this.id = UUID.randomUUID().toString();
		this.username = username;
		this.password = password;
		this.nombre = nombre;
		this.segundoNombre = segundoNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.email = email;
		this.telefono = telefono;
		this.sexo = sexo;
		this.ocupacion = ocupacion;
		this.estadoCivil = estadoCivil;
		this.rfc = rfc;
		this.nacionalidad = nacionalidad;
		this.curp = curp;
		this.fechaNaci = fechaNaci;
		this.lugarNaci = lugarNaci;
		this.imageUrl = imageUrl;
		this.domicilio = domicilio;

	}
	


	private boolean enabled = true;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public List<Domicilio> getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(List<Domicilio> domicilio) {
		this.domicilio = domicilio;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getFechaNaci() {
		return fechaNaci;
	}

	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}

	public String getLugarNaci() {
		return lugarNaci;
	}

	public void setLugarNaci(String lugarNaci) {
		this.lugarNaci = lugarNaci;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nombre=" + nombre
				+ ", segundoNombre=" + segundoNombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", email=" + email + ", telefono=" + telefono + ", sexo=" + sexo + ", ocupacion="
				+ ocupacion + ", estadoCivil=" + estadoCivil + ", rfc=" + rfc + ", nacionalidad=" + nacionalidad
				+ ", curp=" + curp + ", fechaNaci=" + fechaNaci + ", lugarNaci=" + lugarNaci + ", imageUrl=" + imageUrl
				+ ", domicilio=" + domicilio + ", role=" + role + "]";
	}
	


}
