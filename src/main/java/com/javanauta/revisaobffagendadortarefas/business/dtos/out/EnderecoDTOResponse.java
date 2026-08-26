package com.javanauta.revisaobffagendadortarefas.business.dtos.out;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTOResponse {

    private Long id;
    private Long numero;
    private String rua;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
}
