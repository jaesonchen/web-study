package com.asiainfo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 * 
 * @author       zq
 * @date         2018年2月8日  下午3:37:43
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
@RestController
public class Controller {
    
    @RequestMapping("/ajax/post")
    public Map<String, Object> post(@RequestParam Map<String, Object> map) {
        
        Map<String, Object> result = new HashMap<>();
        result.put("status", "200");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
