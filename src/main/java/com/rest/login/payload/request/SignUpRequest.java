package com.rest.login.payload.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SignUpRequest {

    @NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9]{3,20}")
    private String username;
 
    @NotBlank(message = "Email should not be empty!")
    @Size(max = 50)
    @Email(message = "Formatting doesn't look as email!")
    private String email;
    
    private Set<String> role;
    
    @NotBlank(message = "Password cannot be empty!")
    @Size(min = 6, max = 40, message = "Password must have from 6 to 40 characters!")
    private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRole() {
		return this.role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    
}
