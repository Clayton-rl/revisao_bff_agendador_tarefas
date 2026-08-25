package com.javanauta.revisaobffagendadortarefas.business;

import com.javanauta.revisaobffagendadortarefas.business.dtos.EnderecoDTO;
import com.javanauta.revisaobffagendadortarefas.business.dtos.TelefoneDTO;
import com.javanauta.revisaobffagendadortarefas.business.dtos.UsuarioDTO;
import com.javanauta.revisaobffagendadortarefas.infrastructure.client.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTO salvaUsuario(UsuarioDTO dto) {
        return client.salvaUsuario(dto);
    }

    public String loginUsuario(UsuarioDTO dto) {
        return client.login(dto);
    }

    public UsuarioDTO buscaUsuarioPorEmail(String email, String token) {
        return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token) {
        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTO atualizaDadosUsuario(String token, UsuarioDTO dto) {
        return client.atualizaDadosUsuario(dto, token);
    }

    public EnderecoDTO atualizaEndereco(Long id, EnderecoDTO dto, String token) {
        return client.atualizaEndereco(dto, id, token);
    }

    public TelefoneDTO atualizaTelefone(Long id, TelefoneDTO dto, String token) {
        return client.atualizaTelefone(dto, id, token);
    }

    public EnderecoDTO cadastraEndereco(String token, EnderecoDTO dto) {
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTO cadastraTelefone(String token, TelefoneDTO dto) {
        return client.cadastraTelefone(dto, token);
    }
}
