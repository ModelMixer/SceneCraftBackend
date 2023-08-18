package com.model.mixer.conf

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.ApiKey
import springfox.documentation.service.SecurityReference
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spi.service.contexts.SecurityContext
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2
import java.util.*


@Configuration
@EnableSwagger2
@Profile("local", "prod")
class SwaggerConfig {
    //swagger配置

    @Bean
    fun createRestApi(): Docket {
        return Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.model.mixer.controller"))
            .paths(PathSelectors.any())
            .build()
    }
    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("学生提交作业系统 后端RESTful APIs")
            .description("学生提交作业系统")
            .termsOfServiceUrl("https://www.wangzc.wang")
            .version("1.0")
            .build()
    }
}