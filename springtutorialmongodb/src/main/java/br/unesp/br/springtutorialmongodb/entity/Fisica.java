package br.unesp.br.springtutorialmongodb.entity;

import java.util.Date;
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
@EqualsAndHashCode(callSuper = false, exclude = {"dataNascimento"})
@ToString(callSuper = true, includeFieldNames = true)
public class Fisica extends Pessoa {

    @Id
    private String cpf;
    private Date dataNascimento;

    public Fisica() {
    }
}