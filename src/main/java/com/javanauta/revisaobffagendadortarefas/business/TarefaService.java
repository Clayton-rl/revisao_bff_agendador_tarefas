package com.javanauta.revisaobffagendadortarefas.business;


import com.javanauta.revisaobffagendadortarefas.business.dtos.in.TarefaDTORequest;
import com.javanauta.revisaobffagendadortarefas.business.dtos.out.TarefaDTOResponse;
import com.javanauta.revisaobffagendadortarefas.infrastructure.client.TarefaClient;
import com.javanauta.revisaobffagendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TarefaService {

    private final TarefaClient client;

    public TarefaDTOResponse gravaTarefa(String token, TarefaDTORequest dto) {
        return client.gravaTarefa(dto, token);
    }

    public List<TarefaDTOResponse> buscaTarefasAgendadasPorPeriodo(LocalDateTime dataInicial,
                                                                   LocalDateTime dataFinal,
                                                                   String token) {
        return client.buscaTarefasAgendadasPorPeriodo(dataInicial, dataFinal, token);
    }

    public List<TarefaDTOResponse> buscaTarefasPorEmail(String token) {
        return client.buscaTarefasPorEmail(token);
    }

    public void deletaTarefaPorId(String id, String token) {
        client.deletaTarefaPorId(id, token);
    }

    public TarefaDTOResponse alteraStatusNotificacao(StatusNotificacaoEnum status, String id, String token) {
        return client.alteraStatusNotificacao(status, id, token);
    }

    public TarefaDTOResponse updateTarefa(TarefaDTORequest dto, String id, String token) {
        return client.updateTarefa(dto, id, token);
    }
}
