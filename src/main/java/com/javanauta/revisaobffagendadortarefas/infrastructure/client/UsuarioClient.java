package com.javanauta.revisaobffagendadortarefas.infrastructure.client;


import com.javanauta.revisaobffagendadortarefas.business.dtos.in.EnderecoDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.in.LoginDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.in.TelefoneDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.in.UsuarioDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.out.EnderecoDTOResponse;
import com.javanauta.revisaobffagendadortarefas.business.dtos.out.TelefoneDTOResponse;
import com.javanauta.revisaobffagendadortarefas.business.dtos.out.UsuarioDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "usuario", url = "${usuario.url}")
public interface UsuarioClient {

    @PostMapping
    UsuarioDTOResponse salvaUsuario(@RequestBody UsuarioDTORequest dto);

    @PostMapping("/login")
    String login(@RequestBody LoginDTORequest dto);

    @RequestMapping
    UsuarioDTOResponse buscaUsuarioPorEmail(@RequestParam("email") String email,
                                            @RequestHeader("Authorization") String token);

    @DeleteMapping("/{email}")
    void deletaUsuarioPorEmail(@PathVariable String email,
                               @RequestHeader("Authorization") String token);

    @PutMapping
    UsuarioDTOResponse atualizaDadosUsuario(@RequestBody UsuarioDTORequest dto,
                                            @RequestHeader("Authorization") String token);

    @PutMapping("/endereco")
    EnderecoDTOResponse atualizaEndereco(@RequestBody EnderecoDTORequest dto,
                                         @RequestParam("id") Long id,
                                         @RequestHeader("Authorization") String token);

    @PutMapping("/telefone")
    TelefoneDTOResponse atualizaTelefone(@RequestBody TelefoneDTORequest dto,
                                         @RequestParam("id") Long id,
                                         @RequestHeader("Authorization") String token);

    @PostMapping("/endereco")
    EnderecoDTOResponse cadastraEndereco(@RequestBody EnderecoDTORequest dto,
                                         @RequestHeader("Authorization") String token);

    @PostMapping("/telefone")
    TelefoneDTOResponse cadastraTelefone(@RequestBody TelefoneDTORequest dto,
                                         @RequestHeader("Authorization") String token);
}
