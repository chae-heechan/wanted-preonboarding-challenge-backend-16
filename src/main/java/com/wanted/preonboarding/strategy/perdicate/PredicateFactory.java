package com.wanted.preonboarding.strategy.perdicate;

import com.wanted.preonboarding.strategy.perdicate.filter.ApplePredicate;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.SecondaryTable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class PredicateFactory {
    private final Set<ApplePredicate> applePredicateSet;
    private Map<String, ApplePredicate> predicate;

    @PostConstruct
    public void init() {
        createPredicate(applePredicateSet);
    }

    private void createPredicate(Set<ApplePredicate> predicateSet) {
        predicate = new HashMap<String, ApplePredicate>();
        predicateSet.forEach(p -> predicate.put(p.getFilterName(), p));
    }
    
    public ApplePredicate findBy(String className) {
        return predicate.get(className);
    }
}
