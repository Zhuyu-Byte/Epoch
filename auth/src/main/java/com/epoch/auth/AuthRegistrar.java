package com.epoch.auth;

import com.epoch.delegate.service.RegistrarDelegate;
import com.epoch.fixed.enums.RegistrarEnum;
import com.epoch.fixed.util.MySpringContext;
import de.codecentric.boot.admin.client.config.ClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * auth model registrar class
 *
 * @author Zhuyu
 * @since 2021/10/29 14:48
 */
@RegistrarDelegate(function = RegistrarEnum.auth)
@Import(MySpringContext.class)
public class AuthRegistrar {

    //spring admin
    @Bean
    public ClientProperties inputAdmin() {
        ClientProperties properties = new ClientProperties();
        properties.setUrl(new String[]{"http://localhost:8010"});
//        ClientProperties clientProperties = MySpringContext.getBean("ClientProperties");
//        clientProperties.setUrl(new String[]{"http://localhost:8010"});
//        System.out.println("beansOfType = " + clientProperties);
        return properties;
    }


    @Bean
    public void inputAdmins() {
//        ClientProperties properties = new ClientProperties();
//        properties.setUrl(new String[]{"http://localhost:8010"});
        ClientProperties clientProperties = MySpringContext.getBean("ClientProperties");
        System.out.println("clientProperties = " + clientProperties);
//        clientProperties.setUrl(new String[]{"http://localhost:8010"});
//        System.out.println("beansOfType = " + clientProperties);
    }

}