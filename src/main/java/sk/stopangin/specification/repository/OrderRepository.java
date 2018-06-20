package sk.stopangin.specification.repository;

import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import sk.stopangin.specification.Ordr;
import sk.stopangin.specification.QOrdr;

public interface OrderRepository extends QuerydslPredicateExecutor<Ordr>, QuerydslBinderCustomizer<QOrdr>, JpaRepository<Ordr, Long> {
    @Override
    default void customize(QuerydslBindings bindings, QOrdr root) {

        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
