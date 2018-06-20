package sk.stopangin.specification;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class GenericSpecification implements Specification<Ordr> {
    private List<String> fieldNames;
    private String value;

    public GenericSpecification(List<String> fieldNames, String value) {
        this.fieldNames = fieldNames;
        this.value = value;
    }

    @Override
    public Predicate toPredicate(Root<Ordr> root, CriteriaQuery<?> query, CriteriaBuilder builder) {

        List<Predicate> predicates = new ArrayList<>();
        for (String fieldName : fieldNames) {
            predicates.add(builder.like(
                    root.<String>get(fieldName), "%" + value + "%"));
        }

        Predicate result = null;
        for (Predicate predicate : predicates) {
            result = builder.or(predicate);
        }
        return result;
    }
}
