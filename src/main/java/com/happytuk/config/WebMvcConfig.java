package com.happytuk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    //處理跨域問題
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")//跨域路徑
                .allowedOriginPatterns("*")//允許跨域的域名
                .allowCredentials(true)//允許證書
                .allowedMethods("*")//允許的方法
                .maxAge(3688);//跨域時間
        WebMvcConfigurer.super.addCorsMappings(registry);
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //把c:/picture 設置成項目的處理路徑地址
        registry.addResourceHandler("/pic/**").addResourceLocations("file:c:/picture/");
    }
}
