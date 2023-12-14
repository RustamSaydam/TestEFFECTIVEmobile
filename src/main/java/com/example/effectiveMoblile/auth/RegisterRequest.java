package com.example.effectiveMoblile.auth;

import java.util.Objects;

public class RegisterRequest {

    private String firstname;
    private String lastName;
    private String email;
    private String password;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public RegisterRequest(String firstname, String lastName, String email, String password) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

    }


    public RegisterRequest() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisterRequest that = (RegisterRequest) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName, email, password);
    }



}
