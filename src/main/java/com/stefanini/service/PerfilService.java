package com.stefanini.service;

import com.stefanini.dao.entitydao.PerfilDao;
import com.stefanini.model.Perfil;

import com.stefanini.util.IGenericService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

public class PerfilService implements IGenericService<Perfil, Integer> {

    @Inject
    PerfilDao perfilDao;
    /**
     * Salvar uma entidade
     *
     * @param entity
     * @return
     */
    @Override
    public Perfil salvar(@Valid Perfil entity) {
        return perfilDao.salvar(entity);
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public Perfil atualizar(@Valid Perfil entity) {
        return null;
    }

    @Override
    public void remover(Integer id) {

    }

    @Override
    public List<Perfil> getList() {
        return perfilDao.getList();
    }

    @Override
    public Perfil encontrar(Integer id) {
        return null;
    }
}
