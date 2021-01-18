package per.lzy.demo.xml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author liuzhiyuan
 * @date 2021/1/18 21:20
 */
@Configuration
public class WebMvcConfig  extends WebMvcConfigurationSupport {
    /**
     * 设置接口返回格式，可以通过{后缀.xml或者.json,format=xml或者format=json}返回不同的数据
     *
     * @param configurer
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        // 是否支持后缀的方式，高版本spring已弃用该方式
        configurer.favorPathExtension(true)
                // 是否支持请求参数的方式
                .favorParameter(true)
                // 请求参数名
                .parameterName("format")
                // 默认返回格式
                .defaultContentType(MediaType.APPLICATION_ATOM_XML);
    }
}