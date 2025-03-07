package com.fatec.projeto.projeto2025.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.projeto.projeto2025.entites.Cliente;

@RestController
@RequestMapping("/api/cliente")  
public class ClienteController {

    //http://localhost:8080/api/cliente/criarCliente => POST
    @PostMapping("/criarCliente")
    public String criarCliente(@RequestBody Cliente cliente){
        return "O Cliente"+cliente.getNome()+ " de idade"+cliente.getIdade()+" Foi Criado";
    }


}
