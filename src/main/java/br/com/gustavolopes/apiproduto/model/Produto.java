package br.com.gustavolopes.apiproduto.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@Table(name = "produto")
@Entity(name = "produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    private UUID id;
    private String nome;
    private Double preco;
    private String urlFoto;
}
