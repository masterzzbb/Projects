package com.example.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import springfox.documentation.builders.*;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhubin
 * @since 2020-10-23 14:41
 */
@EnableOpenApi
@Configuration
@EnableKnife4j
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return  new Docket(DocumentationType.OAS_30).
                apiInfo(apiInfo()).
                select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .globalRequestParameters(getGlobalRequestParameters())
                .globalResponses(HttpMethod.GET,getGlobalResponseMessage())
                .globalResponses(HttpMethod.DELETE,getGlobalResponseMessage())
                .globalResponses(HttpMethod.HEAD,getGlobalResponseMessage())
                .globalResponses(HttpMethod.POST,getGlobalResponseMessage());
    }

    private ApiInfo apiInfo(){
        String projectName = System.getProperty("user.dir");
        return  new ApiInfoBuilder()
                .title(projectName.substring(projectName.lastIndexOf("\\")+1)+"API接口文档")
                .contact(new Contact("bright", "", "1342018225@qq.com"))
                .version("1.0")
                .description("API文档")
                .build();
    }

    private List<RequestParameter> getGlobalRequestParameters(){
        List<RequestParameter> parameters = new ArrayList<>();
        parameters.add(new RequestParameterBuilder()
                .name("x-access-token")
                .description("令牌")
                .required(false)
                .in(ParameterType.HEADER)
                .build());
        parameters.add(new RequestParameterBuilder()
                .name("Equipment-Type")
                .description("产品类型")
                .required(false)
                .in(ParameterType.HEADER)
                .build());
        return parameters;
    }

    private List<Response> getGlobalResponseMessage(){
        List<Response> responseList = new ArrayList<>();
        responseList.add(new ResponseBuilder().code("404").description("找不到资源").build());
        return responseList;
    }
}
