package com.ninos.useradmin.security.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String email;
    private String token;
    private List<RoleModel> roles;

    public LoginResponse(String email) {
        this.email = email;
    }


}