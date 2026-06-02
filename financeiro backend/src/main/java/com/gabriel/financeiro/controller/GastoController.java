package com.gabriel.financeiro.controller;

import com.gabriel.financeiro.entity.Gasto;
import com.gabriel.financeiro.service.GastoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
@CrossOrigin(origins = "http://localhost:4200")

public class GastoController {

    private final GastoService service;

    public GastoController(GastoService service){
        this.service = service;
    }

    // LISTAR
    @GetMapping
    public List<Gasto> listar(){
        return service.listar();
    }

    // CRIAR
    @PostMapping
    public Gasto salvar(@RequestBody Gasto gasto){
        return service.salvar(gasto);
    }

    // DELETAR
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

    // ATUALIZAR
    @PutMapping("/{id}")
    public Gasto atualizar(
            @PathVariable Long id,
            @RequestBody Gasto gasto){

        return service.atualizar(id, gasto);

    }

}