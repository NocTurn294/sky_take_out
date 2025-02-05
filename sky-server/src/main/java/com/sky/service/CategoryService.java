package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

public interface CategoryService {
    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    void delete(Long id);

    void startOrStop(Integer status, Long id);

    void update(CategoryDTO categoryDTO);

    void save(CategoryDTO categoryDTO);

    List<Category> list(Integer type);
}
