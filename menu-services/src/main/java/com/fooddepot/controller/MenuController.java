package com.fooddepot.controller;

import com.fooddepot.model.Menu;
import com.fooddepot.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService = null;

    @PostMapping("")
    public void saveMenu(@Validated @RequestBody final Menu menu){
        menuService.save(menu);
    }

}
