package hbpu.com.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2018/9/27.
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
@RefreshScope
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

//    @Value("${foo}")
//    String foo;
//    @RequestMapping(value = "/hi")
//    public String hi(){
//        return foo;
//    }
    @Value("${password}")
    String password;
    @Value("${name}")
    String name;
    @RequestMapping(value = "/hi")
    public String hi(){
        System.out.println(password+name);
        return password+name;
    }
}