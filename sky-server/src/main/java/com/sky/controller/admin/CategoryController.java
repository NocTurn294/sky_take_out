package com.sky.controller.admin;

import com.sky.dto.CategoryPageQueryDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/category")
@Slf4j
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

@GetMapping("/page")
    public Result<PageResult> page(CategoryPageQueryDTO categoryPageQueryDTO){
        log.info("菜品目录分页查询：{}",categoryPageQueryDTO);
        PageResult pageResult = categoryService.pageQuery(categoryPageQueryDTO);
        return Result.success(pageResult);

    }
    @DeleteMapping
    public Result delete(Long id){
        log.info("删除菜品目录：{}",id);
        categoryService.delete(id);
        return Result.success();
    }
    @PostMapping("/status/{status}")
    public Result<String> startOrStop(@PathVariable Integer status,Long id){
        log.info("修改菜品目录状态：{}，{}",status,id);
        categoryService.startOrStop(status,id);
        return Result.success();
    }
}
