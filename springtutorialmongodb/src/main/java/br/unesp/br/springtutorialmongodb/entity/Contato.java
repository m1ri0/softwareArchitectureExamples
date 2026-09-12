package br.unesp.br.springtutorialmongodb.entity;

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
public class Contato {

    private long idContato;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String email;

    public Contato() {
    }
}