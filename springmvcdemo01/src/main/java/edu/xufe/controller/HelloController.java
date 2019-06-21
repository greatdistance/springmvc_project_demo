package edu.xufe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName HelloController
 * @Description 第一个spring mvc工程
 * @Author greatDistance
 * @Date 2019/6/21 10:09
 * @Version 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("hello")
    public ModelAndView hello() {
        System.out.println("Hello spring mvc");
        ModelAndView modelAndView = new ModelAndView();
        // 设置模型数据，用于传递到jsp
        modelAndView.addObject("msg", "Hello spring mvc");
        // 设置视图名字，用于响应用户
        modelAndView.setViewName("/WEB-INF/jsp/hello.jsp");
        return modelAndView;
    }
}
