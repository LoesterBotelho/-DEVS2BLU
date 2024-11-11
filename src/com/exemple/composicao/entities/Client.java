package com.exemple.composicao.entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Client {

	private String name;
	private String email;
	private LocalDate birthDate;

	public Client() {

	}

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
		String msg = "\n	Client: %s (%s) - %s";
		
		return String.format(msg
				, this.getName()
				, this.getEmail()
				, this.getBirthDate().format(formatter)
				);		
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(name, other.name);
	}

}
