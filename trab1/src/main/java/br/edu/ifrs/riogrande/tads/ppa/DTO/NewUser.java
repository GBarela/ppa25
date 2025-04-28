package br.edu.ifrs.riogrande.tads.ppa.DTO;

import java.util.List;

// json vindo da requisição

public record NewUser(
        String name,
        String handle,
        String email,
        String password,
        String company,
        Profile.AccountType type,
        List<String> roles
)  {

}
