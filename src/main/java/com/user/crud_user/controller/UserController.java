package com.user.crud_user.controller;

import com.user.crud_user.entity.User;
import com.user.crud_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/test")
    public User criar(@RequestBody User user) {
        return service.salvar(user);
    }

    @GetMapping
    public List<User> listar() {
        return service.listar();
    }

    @GetMapping("/test/{id}")
    public User buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/test/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}