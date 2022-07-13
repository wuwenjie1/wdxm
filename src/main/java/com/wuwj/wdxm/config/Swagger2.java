package com.wuwj.wdxm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description Swagger2配置类
 * @Date 2022-07-07 19:23
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("甲工程")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wuwj.wdxm.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * @Description 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     * @Date 2022/6/29 18:07
     * @Param []
     * @return springfox.documentation.service.ApiInfo
     **/
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("我的测试工程")
                .description("这是我的测试工程描述")
                .termsOfServiceUrl("www.baidu.com")
                .contact(new Contact("wuwj", "https://fanyi.baidu.com/#en/zh/", "xxx@163.com"))
                .version("1.0")
                .build();
    }
}
