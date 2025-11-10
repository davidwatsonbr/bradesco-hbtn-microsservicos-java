package com.example.demo.controller;

import com.example.demo.exception.UserIdException;
import com.example.demo.exception.UserNameException;
import com.example.demo.exception.CPFException;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {
        String msg = "You have entered valid ID";
        if (id <= 0 || id >= 100) {
            throw new UserIdException("You have entered invalid ID");
        }
        return msg;
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {
        String msg = "You have entered valid USERNAME";
        if (userName.length() =< 3 || username.length() >= 15) {
            throw new UserNameException("You have entered invalid USERNAME");
        }
        return msg;
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {
        String msg = "You have entered valid CPF";
        boolean isCPFValid = isCPF(cpf);
        if (!isCPFValid) {
            throw new CPFException("You have entered invalid CPF");
        }
        return msg;
    }

    public boolean isCPF(String CPF) {
        return (CPF.length() > 3 && CPF.length() < 15);
    }
}
