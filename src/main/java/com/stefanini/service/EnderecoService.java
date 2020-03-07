package com.stefanini.service;

import com.stefanini.dao.entitydao.EnderecoDao;
import com.stefanini.model.Endereco;

import com.stefanini.util.IGenericService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

public class EnderecoService implements IGenericService<Endereco, Integer> {

    @Inject
    EnderecoDao enderecoDao;
    /**
     * Salvar uma entidade
     *
     * @param entity
     * @return
     */
    @Override
    public Endereco salvar(@Valid Endereco entity) {
        return enderecoDao.salvar(entity);
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public Endereco atualizar(@Valid Endereco entity) {
        return null;
    }

    @Override
    public void remover(Integer id) {

    }

    @Override
    public List<Endereco> getList() {
        return enderecoDao.getList();
    }

    @Override
    public Endereco encontrar(Integer id) {
        return null;
    }
}
