package com.stefanini.teste;

import com.stefanini.model.Pessoa;
import com.stefanini.service.PessoaService;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;
import java.time.LocalDate;


public class App {

    @Inject
    PessoaService pessoaService;

    public static void main(String[] args) {
        //CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        try (final SeContainer container = initializer.initialize()) {
            App app = container.select(App.class).get();
            app.executar();
        }
    }

    public void executar() {
        salvarPessoa();
        buscarTodas();
    }

    public void buscarTodas(){
        pessoaService.getList().forEach(x -> System.out.println(x));
    }

    public void salvarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail("Phael@gmail.com");
        pessoa.setDataNascimento(LocalDate.of(1997, 8, 23));
        pessoa.setNome("Raphael");
        pessoa.setSituacao(Boolean.TRUE);

        pessoaService.salvar(pessoa);
    }
}
