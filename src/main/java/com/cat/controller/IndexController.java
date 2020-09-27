package com.cat.controller;

import com.cat.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class IndexController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","张三");
        model.addAttribute("sex","男");
        model.addAttribute("age",23);
        System.out.println(model);

//        Person person = new Person();
//        person.name="李四";
//        person.sex="男";
//        person.age=14;
//        model.addAttribute("person",person);
        return "hello";
    }
        @RequestMapping("/hello2")
        public ModelAndView hello(){

            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("hello2");  //返回到那个文件
            modelAndView.addObject("name","派大星");
            modelAndView.addObject("sex","男");
            modelAndView.addObject("age",53);
            System.out.println(modelAndView);
            return modelAndView;
        }
}
