package com.carlos.produtos.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.carlos.produtos.entities.User;
import com.carlos.produtos.repositories.UserRepository;

@Configuration
@Profile("test") //perfil teste//
public class TestConfig implements CommandLineRunner { // interface CommandLineRunner, é para iniciar o objeto user no inicio da aplicação\\

    @Autowired
    private UserRepository userRepository; // instancia da interface jpa

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

        userRepository.saveAll(Arrays.asList(u1,u2)); //salva o User u1 e u2 em uma array e aplica no inicio e envia para o banco de dados \\

    }
}