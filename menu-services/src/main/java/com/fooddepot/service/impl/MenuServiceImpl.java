package com.fooddepot.service.impl;

import com.fooddepot.dao.MenuRepositry;
import com.fooddepot.model.Menu;
import com.fooddepot.service.MenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService{

    private MenuRepositry menuRepositry = null;

    @Override
    public void save(Menu menu) {
        menuRepositry.save(menu);
    }
}
