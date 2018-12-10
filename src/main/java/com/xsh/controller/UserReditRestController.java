package com.xsh.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zerox
 * @date 2018/12/4 10:58
 */
@RestController
public class UserReditRestController {

    /**
     *
     * @param id 路径所携带的参数
     * @return 查询之后的结果
     *
     * PS：RequestMapping这个路径请求参数中的Value如果没有/会怎么样呢? 我们一会试验下.
     */
    @RequestMapping(value ="/usercredit/{id}")
    public Integer getCreditLevel(@PathVariable String id) {
        // 模拟用户的信用等级
        return 3;
    }
}
