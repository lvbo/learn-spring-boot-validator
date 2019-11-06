package io.github.lvbo.lsb.validator.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


/**
 * Spring Boot 国际化验证 @Validated 的 message 国际化资源文件默认必须放在 resources/ValidationMessages.properties 中
 * 若要自定义文件位置或名称则需要重写 WebMvcConfigurerAdapter 的 getValidator 方法
 * 但 WebMvcConfigurerAdapter 在 Spring Boot 2.x 中已经废弃了，可以改为使用 WebMvcConfigurationSupport
 * @author lvbo
 * @version V1.0
 * @date 2019/11/5 19:24
 */
@Configuration
public class ValidatorConfig extends WebMvcConfigurationSupport {
    @Autowired
    private MessageSource messageSource;

    @Override
    public Validator getValidator() {
        return validator();
    }

    @Bean
    public Validator validator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setValidationMessageSource(messageSource);
        return validator;
    }
}
