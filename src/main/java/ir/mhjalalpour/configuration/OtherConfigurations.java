package ir.mhjalalpour.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
public class OtherConfigurations {
//    @Bean
//@Description("Thymeleaf Template Resolver")
//public static ServletContextTemplateResolver templateResolver() {
//    ServletContextTemplateResolver templateResolver = null;//= new ServletContextTemplateResolver("");
//    templateResolver.setPrefix("/WEB-INF/views/");
//    templateResolver.setSuffix(".html");
//    templateResolver.setTemplateMode("HTML5");
//
//    return templateResolver;
//}
//    @Bean
//    @Description("Thymeleaf Template Engine")
//    public static SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.setTemplateEngineMessageSource(messageSource());
//        return templateEngine;
//    }
//
//    @Bean
//    @Description("Spring Message Resolver")
//    public static ResourceBundleMessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
}




//    @Bean
//    @Description("Thymeleaf View Resolver")
//    public ThymeleafViewResolver viewResolver() {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(OtherConfigurations.templateEngine());
//        viewResolver.setOrder(1);
//        return viewResolver;
//    }