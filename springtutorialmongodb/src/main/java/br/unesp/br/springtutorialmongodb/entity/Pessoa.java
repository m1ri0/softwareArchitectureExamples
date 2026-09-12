package br.unesp.br.springtutorialmongodb.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Prof. Dr. Frank J. Affonso
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Pessoa {

    private long idPessoa;
    private String nome;
    private List<Endereco> endereco;
    private Acesso acesso;
    private Contato contato;

    public Pessoa() {
        this.endereco = new ArrayList<>();
    }

    public void setEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }
}