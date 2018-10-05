package sk.stopangin.specification.service;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.stopangin.specification.Ordr;
import sk.stopangin.specification.QOrdr;
import sk.stopangin.specification.model.PrivacyPolicyAcceptance;
import sk.stopangin.specification.model.PrivacyPolicyAcceptanceStatus;
import sk.stopangin.specification.model.QPrivacyPolicyAcceptance;
import sk.stopangin.specification.model.security.QUser;
import sk.stopangin.specification.model.security.User;
import sk.stopangin.specification.repository.OrderRepository;
import sk.stopangin.specification.repository.PrivacyPolicyAcceptanceRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

import static sk.stopangin.specification.model.security.QUser.user;

@Service
@Transactional
public class OrderService {


    @PersistenceContext
    private EntityManager em;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PrivacyPolicyAcceptanceRepository privacyPolicyAcceptanceRepository;

    public void init() {
        User d1 = new User();
        d1.setId(1l);
        em.remove(d1);

        User d2 = new User();
        d2.setId(2l);
        em.remove(d2);

        User d3 = new User();
        d3.setId(3l);
        em.remove(d3);
        User u = new User();
        u.setId(1l);
        u.setUsername("gajaka");
        em.persist(u);


        User u2 = new User();
        u2.setId(2l);
        u2.setUsername("gajaka2");
        em.persist(u2);

        User u3 = new User();
        u3.setId(3l);

        u3.setUsername("asistant");
        u3.setParentUser(u2.getId());
        em.persist(u3);


        PrivacyPolicyAcceptance privacyPolicyAcceptance = new PrivacyPolicyAcceptance();
        privacyPolicyAcceptance.setId(1l);
        em.remove(privacyPolicyAcceptance);
        privacyPolicyAcceptance.setStatus(PrivacyPolicyAcceptanceStatus.ACCEPTED);
        privacyPolicyAcceptance.setUser(u);
        privacyPolicyAcceptance.setDate(1l);
        em.persist(privacyPolicyAcceptance);


        PrivacyPolicyAcceptance privacyPolicyAcceptance2 = new PrivacyPolicyAcceptance();
        privacyPolicyAcceptance2.setId(2l);
        em.remove(privacyPolicyAcceptance2);
        privacyPolicyAcceptance2.setStatus(PrivacyPolicyAcceptanceStatus.ACCEPTED);
        privacyPolicyAcceptance2.setUser(u2);
        privacyPolicyAcceptance2.setDate(1l);
        em.persist(privacyPolicyAcceptance2);
    }

    public List<User> testQuery(Long cerrentUserId) {
        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(em);
        final Long parentId = jpaQueryFactory.selectFrom(QUser.user).where(QUser.user.id.eq(cerrentUserId)).fetchOne().getParentUser();

        System.out.println("--------------------");
        System.out.println(parentId);
        System.out.println("--------------------");

        return jpaQueryFactory.selectFrom(QPrivacyPolicyAcceptance.privacyPolicyAcceptance)
                .where(QPrivacyPolicyAcceptance.privacyPolicyAcceptance.status.eq(PrivacyPolicyAcceptanceStatus.ACCEPTED))
                .innerJoin(QPrivacyPolicyAcceptance.privacyPolicyAcceptance.user, user)
                .where(user.id.eq(cerrentUserId).or(user.id.eq(parentId))
                )
                .fetch().stream().map(privacyPolicyAcceptance ->
                        privacyPolicyAcceptance.getUser()).collect(Collectors.toList());
    }


    public List<PrivacyPolicyAcceptance> test() {
        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(em);
        return jpaQueryFactory.selectFrom(QPrivacyPolicyAcceptance.privacyPolicyAcceptance).where(QPrivacyPolicyAcceptance.privacyPolicyAcceptance
                .id.eq(2l)).fetch();
    }

    public Iterable<Ordr> searchBy(String name, String descOrUsername) {
        BooleanExpression and = QOrdr.ordr.uname.like(name).and(QOrdr.ordr.id.eq(1l)).and(QOrdr.ordr.description.like(descOrUsername).or(QOrdr.ordr
                .usr.username.like(descOrUsername)));


        return orderRepository.findAll(and);
    }
}
