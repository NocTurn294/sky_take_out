package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    @Delete("delete from category where id = #{id}")
    void delete(Long id);



    void update(Category category);

    @Insert("insert into category (id,type,sort,name, status, create_time, update_time, create_user, update_user) " +
            "values " +
            "(#{id},#{type},#{sort},#{name},  #{status}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
    void insert(Category category);
}
