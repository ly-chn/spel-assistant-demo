package kim.nzxy.demo.controller;

import kim.nzxy.demo.annotations.DemoAnno;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一个简单的Controller, 用于示例
 * @author ly
 */
@RestController
public class DemoSpELController {
    @DemoAnno(spelValue = "id+demo")
    public void test(String id) {

    }
    @DemoAnno(spelTemplateValue = "#{id+demo}")
    public void test2(String id) {

    }
}
