package com.yp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * 控制器类
 * @Controller：创建处理器对象，对象放在springmvc容器中
 */
@RequestMapping("/my") //requestMapping在类的上面，其中的value表示url的公共模块
@Controller
public class MyController {
    /**
     * 处理用户提交的请求
     */


    /**
     *  @RequestMapping
     * 处理器方法或者控制器方法
     * 将一个url和一个处理方法进行绑定， 该方法就会处理url来的请求
     *      本方法中是将doSome方法与some.do进行绑定
     * @return ModelAndView表示本次的请求结果
     *      Model:数据，请求处理，显示用户的数据
     *      View:视图，比如jsp等等
     */
    @RequestMapping(value = {"/some.do", "/first.do"})//添加method属性，限制必须是get方法
    public ModelAndView doSome(){
        //处理some.do的请求

        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("msg", "欢迎");
        mv.addObject("fun", "执行doSome");

        //指定视图,指定视图的完整路径
        mv.setViewName("/index.jsp");//在视图解析器中已经添加过了前缀和后缀

        return  mv;
    }
}
