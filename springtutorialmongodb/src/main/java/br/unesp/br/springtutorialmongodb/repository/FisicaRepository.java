package br.unesp.br.springtutorialmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.unesp.br.springtutorialmongodb.entity.Fisica;

public interface FisicaRepository extends MongoRepository<Fisica, String> {

    Fisica findByCpf(String cpf);

    void deleteByCpf(String cpf);
}