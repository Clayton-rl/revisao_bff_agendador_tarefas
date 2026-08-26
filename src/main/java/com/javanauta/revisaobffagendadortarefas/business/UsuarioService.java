package com.javanauta.revisaobffagendadortarefas.business;

import com.javanauta.revisaobffagendadortarefas.business.dtos.in.EnderecoDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.in.LoginDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.in.TelefoneDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.in.UsuarioDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.out.EnderecoDTOResponse;
import com.javanauta.revisaobffagendadortarefas.business.dtos.out.TelefoneDTOResponse;
import com.javanauta.revisaobffagendadortarefas.business.dtos.out.UsuarioDTOResponse;
import com.javanauta.revisaobffagendadortarefas.infrastructure.client.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest dto) {
        return client.salvaUsuario(dto);
    }

    public String loginUsuario(LoginDTORequest dto) {
        return client.login(dto);
    }

    public UsuarioDTOResponse buscaUsuarioPorEmail(String email, String token) {
        return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token) {
        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto) {
        return client.atualizaDadosUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long id, EnderecoDTORequest dto, String token) {
        return client.atualizaEndereco(dto, id, token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long id, TelefoneDTORequest dto, String token) {
        return client.atualizaTelefone(dto, id, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto) {
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto) {
        return client.cadastraTelefone(dto, token);
    }
}
