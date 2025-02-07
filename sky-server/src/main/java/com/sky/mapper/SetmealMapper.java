package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SetmealMapper {
  @AutoFill(OperationType.UPDATE)
void update(Setmeal setmeal);

  Page<SetmealVO> pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

  @AutoFill(OperationType.INSERT)
  @Insert("insert into setmeal (name, category_id, price, image, description, status, create_time, update_time, create_user, update_user) values " +
          "(#{name}, #{categoryId}, #{price}, #{image}, #{description}, #{status}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
  void insert(Setmeal setmeal);
}
