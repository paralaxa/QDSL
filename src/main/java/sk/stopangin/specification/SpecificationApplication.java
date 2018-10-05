package sk.stopangin.specification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.stopangin.specification.model.PrivacyPolicyAcceptance;
import sk.stopangin.specification.model.security.User;
import sk.stopangin.specification.service.OrderService;

import java.util.List;

@SpringBootApplication
public class SpecificationApplication implements ApplicationRunner {


    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(SpecificationApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        orderService.init();
        final List<User> users = orderService.testQuery(3l);
        for (User user : users) {
            System.out.println(user.getUsername());
        }

        final List<PrivacyPolicyAcceptance> test = orderService.test();
        for (PrivacyPolicyAcceptance privacyPolicyAcceptance : test) {
            System.out.println(privacyPolicyAcceptance);
        }
    }
}
