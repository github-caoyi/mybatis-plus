//package com.study.mybatisplus.config;
//
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.alibaba.fastjson.support.config.FastJsonConfig;
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Author cy
// * @Date 2020/7/3 9:59
// * @Description fastjson配置
// *  注意：1.使用fastjson之后导致对象属性顺序发生变化，暂时停用
// *          若要使用可以使用@JSONField(ordinal=1,name = "name")注解，odrdinal指定顺序，name指定生成的JSON对象中对应属性的名称
// **/
////@Configuration
//public class FastJSONConfiguration {
//
//    /**
//     * 配置消息转换器
//     * new HttpMessageConverters(true, converters);
//     * 一定要设为true才能替换否则不会替换
//     *
//     * @return 返回一个消息转换的bean
//     */
//    @Bean
//    public HttpMessageConverters fastJsonMessageConverters() {
//        List<HttpMessageConverter<?>> converters = new ArrayList<>();
//        //需要定义一个convert转换消息的对象;
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        //添加fastJson的配置信息;
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        //全局时间配置
//        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
//        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
//        //处理中文乱码问题
//        List<MediaType> fastMediaTypes = new ArrayList<>();
//        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        //在convert中添加配置信息.
//        fastConverter.setSupportedMediaTypes(fastMediaTypes);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        converters.add(0, fastConverter);
//        return new HttpMessageConverters(converters);
//    }
//}