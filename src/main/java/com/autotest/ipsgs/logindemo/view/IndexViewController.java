package com.autotest.ipsgs.logindemo.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with logindemo.
 * Author: dreamer-1
 * Email: zhong--lei@outllok.com
 * Date: 2018/5/13
 * Time: 下午2:58
 * Description:
 */
@Controller
public class IndexViewController {
    /**
     * 登录
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "login";
    }

    /**
     * 欢迎页
     * @return
     */
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}
