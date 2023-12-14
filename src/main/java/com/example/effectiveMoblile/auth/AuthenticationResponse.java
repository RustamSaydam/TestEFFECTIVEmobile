package com.example.effectiveMoblile.auth;


import java.util.Objects;

public class AuthenticationResponse {
    private String token;

    public static AuthenticationResponseBuilder builder() {
        return new AuthenticationResponseBuilder();
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public AuthenticationResponse() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthenticationResponse that = (AuthenticationResponse) o;
        return Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    public static class AuthenticationResponseBuilder {
        private String token;

        AuthenticationResponseBuilder() {
        }

        public AuthenticationResponseBuilder token(String token) {
            this.token = token;
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(token);
        }

        public String toString() {
            return "AuthenticationResponse.AuthenticationResponseBuilder(token=" + this.token + ")";
        }
    }
}
