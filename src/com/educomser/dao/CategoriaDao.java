package com.educomser.dao;

import com.educomser.domain.Categoria;
import java.util.List;

public interface CategoriaDao {
    public List<Categoria> findAll();
    public Categoria findById(int id);
}
