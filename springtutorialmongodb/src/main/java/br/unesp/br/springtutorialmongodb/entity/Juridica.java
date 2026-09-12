package br.unesp.br.springtutorialmongodb.entity;

import org.springframework.data.annotation.Id;
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
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true, includeFieldNames = true)
public class Juridica extends Pessoa {

    @Id
    private String cnpj;

    public Juridica() {
    }
}