package sk.stopangin.specification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.stopangin.specification.service.OrderService;

@SpringBootApplication
public class SpecificationApplication implements ApplicationRunner {


    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(SpecificationApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Iterable<Ordr> orders = orderService.searchBy("o1", "d1");
        for (Ordr order : orders) {
            System.out.println(order.getId());
        }
    }
}
