package com.example.layui.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class AuthorizationInterceptor implements HandlerInterceptor {

    @Value("${static.path}")
    private String path;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.debug("  进入拦截器, 请求url : {}", request.getServletPath());
        String urlPath = request.getServletPath();

        //  配置静态路径
        if (request.getServletContext().getAttribute("basePath") == null) {
            //String staticPath = Config.getValue("static.path");
            String staticPath = path;
            log.debug("配置静态资源地址 :" + staticPath);
            request.getServletContext().setAttribute("basePath", staticPath);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}