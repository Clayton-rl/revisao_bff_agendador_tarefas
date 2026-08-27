package com.javanauta.revisaobffagendadortarefas.infrastructure.client;


import com.javanauta.revisaobffagendadortarefas.business.dtos.out.TarefaDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notificacao", url = "${notificacao.url}")
public interface EmailClient {

    @PostMapping
    void enviaEmail(@RequestBody TarefaDTOResponse dto);
}
