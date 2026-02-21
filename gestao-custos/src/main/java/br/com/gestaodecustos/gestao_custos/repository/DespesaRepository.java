package br.com.gestaodecustos.gestao_custos.repository;

import br.com.gestaodecustos.gestao_custos.entity.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {

}
