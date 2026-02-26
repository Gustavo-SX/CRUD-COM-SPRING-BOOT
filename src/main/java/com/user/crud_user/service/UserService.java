package com.user.crud_user.service;

import com.user.crud_user.entity.User;
import com.user.crud_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class UserService {

        @Autowired
        private UserRepository repository;

        public User salvar(User user) {
            return repository.save(user);
        }

        public List<User> listar() {
            return repository.findAll();
        }

        public User buscarPorId(Long id) {
            return repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        }

        public void deletar(Long id) {
            repository.deleteById(id);
        }
    }

