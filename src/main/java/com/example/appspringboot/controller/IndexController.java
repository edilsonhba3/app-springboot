package com.example.appspringboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController 
{
	@RequestMapping("app")
    public Object index()
	{
		Map<String, Object> map = new HashMap<>();
		map.put("app status", "app is runnig.");
        return map;
    }
}
