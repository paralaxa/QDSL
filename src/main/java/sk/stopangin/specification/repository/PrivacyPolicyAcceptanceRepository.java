package sk.stopangin.specification.repository;

import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import sk.stopangin.specification.model.PrivacyPolicyAcceptance;
import sk.stopangin.specification.model.QPrivacyPolicyAcceptance;

/**
 * Created by martin.cuchran on 10/5/2018.
 */
public interface PrivacyPolicyAcceptanceRepository extends QuerydslPredicateExecutor<PrivacyPolicyAcceptance>,
        QuerydslBinderCustomizer<QPrivacyPolicyAcceptance>, JpaRepository<PrivacyPolicyAcceptance, Long> {
    @Override
    default void customize(QuerydslBindings bindings, QPrivacyPolicyAcceptance root) {

        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
