package api.web.DTO;

import api.web.entity.Usuario;

public class LoginResponse {
    private String token;
    private Usuario user;

    public LoginResponse(String token, Usuario user) {
        this.token = token;
        this.user = user;
    }

    // Getters y setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}

