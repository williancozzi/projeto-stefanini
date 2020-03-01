package com.stefanini.service;

import com.stefanini.dao.entitydao.PessoaDao;
import com.stefanini.model.Pessoa;
import com.stefanini.util.IGenericService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

public class PessoaService implements IGenericService<Pessoa, Long> {

    @Inject
    PessoaDao pessoaDao;
    /**
     * Salvar uma entidade
     *
     * @param entity
     * @return
     */
    @Override
    public Pessoa salvar(@Valid Pessoa entity) {
        return pessoaDao.salvar(entity);
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public Pessoa atualizar(@Valid Pessoa entity) {
        return null;
    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public List<Pessoa> getList() {
        return pessoaDao.getList();
    }

    @Override
    public Pessoa encontrar(Long id) {
        return null;
    }
}
