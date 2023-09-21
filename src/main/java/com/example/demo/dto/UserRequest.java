package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor(staticName = "build")
//@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "username shouldn't be null")
    private String name;
    @Email(message = "invalid email address")
    private String email;
    private String mobile;
    private String gender;
    @Min(message = "Must between 18 to 60", value = 18)
    @Max(60)
    private int age;
    @NotEmpty(message = "enter your nationality" )
    private String nationality;
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRequest(@NotBlank(message = "username shouldn't be null") String name,
			@Email(message = "invalid email address") String email, String mobile, String gender,
			@Min(message = "Must between 18 to 60", value = 18) @Max(60) int age,
			@NotEmpty(message = "enter your nationality") String nationality) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.age = age;
		this.nationality = nationality;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
