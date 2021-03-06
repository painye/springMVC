package com.yp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yp.vo.Student;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


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
     * @return ModelAndView表示本次的请求结果
     * Model:数据，请求处理，显示用户的数据
     * View:视图，比如jsp等等
     * <p>
     * doSome方法的参数
     * 逐一接收参数
     * String StrName = request.getParam("name")
     * String StrAge = request.getParam("age")
     * 此时需要控制器方法中形参的名字和request中提价过来的数据的名字相同这样就睡一一对应
     * springMvc容器会通过中央控制器调用deSome方法其中request与形参中相同的请求数据会提交，其中spring会做自动类型转换
     * doSome(StrName, (int) StrAge)
     * @RequestMapping 处理器方法或者控制器方法
     * 将一个url和一个处理方法进行绑定， 该方法就会处理url来的请求
     * 本方法中是将doSome方法与some.do进行绑定
     */
    @RequestMapping(value = {"/some"})//string雷翔的返回值值返回视图也就是网页
    public ModelAndView receiveObject(String name, String age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);

        mv.setViewName("show");

        return mv;
    }
}

