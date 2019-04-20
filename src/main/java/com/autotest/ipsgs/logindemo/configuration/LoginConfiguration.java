package com.autotest.ipsgs.logindemo.configuration;

import com.autotest.ipsgs.logindemo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with logindemo.
 * Author: dreamer-1
 * Email: zhong--lei@outllok.com
 * Date: 2018/5/13
 * Time: 下午2:58
 * Description:
 */
@Configuration
public class LoginConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        InterceptorRegistration loginRegistry = registry.addInterceptor(loginInterceptor);
        // 拦截路径
        loginRegistry.addPathPatterns("/**");
        // 排除路径
        loginRegistry.excludePathPatterns("/");
        loginRegistry.excludePathPatterns("/login");
        loginRegistry.excludePathPatterns("/test/test1");
        loginRegistry.excludePathPatterns("/loginout");
        // 排除资源请求
        loginRegistry.excludePathPatterns("/jquery/**");
//        loginRegistry.excludePathPatterns("/jquery/demo/css/*.css");
//        loginRegistry.excludePathPatterns("/jquery/demo/js/*.js");
//        loginRegistry.excludePathPatterns("/jquery/demo/image/*.*");
    }
}
