package com.yp.controller;

import com.yp.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
     *
     * doSome方法的参数
     *      逐一接收参数
     *              String StrName = request.getParam("name")
     *              String StrAge = request.getParam("age")
     *            此时需要控制器方法中形参的名字和request中提价过来的数据的名字相同这样就睡一一对应
     *            springMvc容器会通过中央控制器调用deSome方法其中request与形参中相同的请求数据会提交，其中spring会做自动类型转换
     *                  doSome(StrName, (int) StrAge)
     */

    @RequestMapping(value = {"/some.do", "/first.do"})//添加method属性，限制必须是get方法
    public ModelAndView doSome(String name, int age){
        //处理some.do的请求nt

        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("name", name);
        mv.addObject("age", age);

        //指定视图,指定视图的完整路径
        mv.setViewName("show");//在视图解析器中已经添加过了前缀和后缀

        return  mv;
    }


    /**
     * @RequstParam注解是用来解决在前台传递请求时，出现的request的参数名与控制方法的参数名之间不相同的问题
     *      其中该注解的参数
     *          1、value 属性的值表示了控制器方法的参数与请求中为value字符串的参数的值
     *          2、required 属性表示了该请求参数是否能为空值， true为必须优质不能为空， false表示可以为空值
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = {"/receive.do"})//添加method属性，限制必须是get方法
    public ModelAndView receive(@RequestParam(value = "rname", required = false) String name, @RequestParam(value = "rage", required = false) int age){
        //处理some.do的请求nt

        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("name", name);
        mv.addObject("age", age);

        //指定视图,指定视图的完整路径
        mv.setViewName("show");//在视图解析器中已经添加过了前缀和后缀

        return  mv;
    }

    @RequestMapping(value = {"/receiveObject.do"})//添加method属性，限制必须是get方法
    public ModelAndView receiveObject(Student stu){
        //处理some.do的请求nt

        ModelAndView mv = new ModelAndView();
        //添加数据
        mv.addObject("name", stu.getName());
        mv.addObject("age", stu.getAge());
        mv.addObject("student", stu);

        //指定视图,指定视图的完整路径
        mv.setViewName("showObject");//在视图解析器中已经添加过了前缀和后缀

        return  mv;
    }
}
