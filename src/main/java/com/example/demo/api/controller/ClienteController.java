package com.example.demo.api.controller;

import com.example.demo.api.controller.domain.models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> listar(){

        var cliente1 = new  Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Joao");
        cliente1.setTelefone("4898876-6592");
        cliente1.setEmail("joao.luis@gmail.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Gabriel");
        cliente2.setTelefone("498879-7689");
        cliente2.setEmail("gabriel.ferreira@gmail.com");

        return Arrays.asList(cliente1, cliente2);
    }
}
