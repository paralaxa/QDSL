package sk.stopangin.specification.service;

import com.querydsl.core.types.Order;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.stopangin.specification.Ordr;
import sk.stopangin.specification.QOrdr;
import sk.stopangin.specification.Usr;
import sk.stopangin.specification.repository.OrderRepository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class OrderService {


    @PersistenceContext
    private EntityManager em;

    @Autowired
    private OrderRepository orderRepository;

    @PostConstruct
    public void init() {
        Ordr o1 = new Ordr();
        o1.setUname("o1");
        o1.setDescription("d1");
        Usr u1 = new Usr();
        u1.setUsername("d1");
        o1.setUsr(u1);

        Ordr o2 = new Ordr();
        o2.setUname("o2");
        o2.setDescription("d2");
        Usr u2 = new Usr();
        u2.setUsername("u2");
        o2.setUsr(u2);

        Ordr o3 = new Ordr();
        o3.setUname("o3");
        o3.setDescription("d3");
        Usr u3 = new Usr();
        u3.setUsername("u3");
        o3.setUsr(u3);
        orderRepository.save(o1);
    }

    public Iterable<Ordr> searchBy(String name, String descOrUsername) {
        BooleanExpression and = QOrdr.ordr.uname.like(name).and(QOrdr.ordr.id.eq(1l)).and(QOrdr.ordr.description.like(descOrUsername).or(QOrdr.ordr.usr.username.like(descOrUsername)));
        return orderRepository.findAll(and);
    }
}
