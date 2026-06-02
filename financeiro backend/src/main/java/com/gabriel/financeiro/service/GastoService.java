package com.gabriel.financeiro.service;

import com.gabriel.financeiro.entity.Gasto;
import com.gabriel.financeiro.repository.GastoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GastoService {

    private final GastoRepository repository;

    public GastoService(GastoRepository repository){
        this.repository = repository;
    }

    // LISTAR
    public List<Gasto> listar(){
        return repository.findAll();
    }

    // CRIAR
    public Gasto salvar(Gasto gasto){
        return repository.saveAndFlush(gasto);
    }

    // DELETAR
    public void deletar(Long id){
        repository.deleteById(id);
        repository.flush();
    }

    // ATUALIZAR
    public Gasto atualizar(Long id, Gasto gastoAtualizado){

        Gasto gasto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gasto não encontrado"));

        gasto.setTitulo(gastoAtualizado.getTitulo());
        gasto.setValor(gastoAtualizado.getValor());
        gasto.setCategoria(gastoAtualizado.getCategoria());
        gasto.setData(gastoAtualizado.getData());

        return repository.saveAndFlush(gasto);
    }
}

