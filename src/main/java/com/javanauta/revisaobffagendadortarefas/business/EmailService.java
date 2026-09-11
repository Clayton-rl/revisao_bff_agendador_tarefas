package com.javanauta.revisaobffagendadortarefas.business;

import com.javanauta.revisaobffagendadortarefas.business.dtos.out.TarefaDTOResponse;
import com.javanauta.revisaobffagendadortarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient client;

    public void enviaEmail(TarefaDTOResponse dto) {
        client.enviaEmail(dto);
    }
}
