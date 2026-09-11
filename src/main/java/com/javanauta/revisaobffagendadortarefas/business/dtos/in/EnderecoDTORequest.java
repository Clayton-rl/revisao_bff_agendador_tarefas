package com.javanauta.revisaobffagendadortarefas.business.dtos.in;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTORequest {

    private Long numero;
    private String rua;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
}
