package com.dry.backend.dto.users.request;

import com.dry.backend.domain.users.Rol;

import java.util.Collection;

/**
 * @author Bruno Ramirez
 **/
public class UserCreateRequest {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Long phone;
    private String username;
    private String password;
    private Collection<Rol> rol;

    public UserCreateRequest() {
    }

    public UserCreateRequest(String email) {
        this.email = email;
    }

    public UserCreateRequest(String name, String lastName, String email, Long phone, String username, String password, Collection<Rol> rol) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public UserCreateRequest(Long id, String name, String lastName, String email, Long phone, String username, String password, Collection<Rol> rol) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
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

    public Collection<Rol> getRol() {
        return rol;
    }

    public void setRol(Collection<Rol> rol) {
        this.rol = rol;
    }
}
