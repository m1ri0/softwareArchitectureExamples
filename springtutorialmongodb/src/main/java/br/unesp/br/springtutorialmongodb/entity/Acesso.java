package br.unesp.br.springtutorialmongodb.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Prof. Dr. Frank J. Affonso
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Acesso {
    private String usuario;
    private String senha;

    public Acesso() {
    }
}