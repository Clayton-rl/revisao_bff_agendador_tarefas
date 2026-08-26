package com.javanauta.revisaobffagendadortarefas.infrastructure.client;


import com.javanauta.revisaobffagendadortarefas.business.dtos.in.TarefaDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.out.TarefaDTOResponse;
import com.javanauta.revisaobffagendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@FeignClient(name = "agendador-tarefas", url = "${agendador-tarefas.url}")
public interface TarefaClient {


    @PostMapping
    TarefaDTOResponse gravaTarefa(@RequestBody TarefaDTORequest dto,
                                  @RequestHeader("Authorization") String token);

    @GetMapping("/eventos")
    List<TarefaDTOResponse> buscaTarefasAgendadasPorPeriodo(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataInicial,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataFinal,
            @RequestHeader("Authorization") String token);

    @GetMapping
    List<TarefaDTOResponse> buscaTarefasPorEmail(@RequestHeader("Authorization") String token);

    @DeleteMapping
    void deletaTarefaPorId(@RequestParam("id") String id,
                           @RequestHeader("Authorization") String token);

    @PatchMapping
    TarefaDTOResponse alteraStatusNotificacao(@RequestParam("status") StatusNotificacaoEnum status,
                                              @RequestParam("id") String id,
                                              @RequestHeader("Authorization") String token);

    @PutMapping
    TarefaDTOResponse updateTarefa(@RequestBody TarefaDTORequest dto,
                                   @RequestParam("id") String id,
                                   @RequestHeader("Authorization") String token);
}
