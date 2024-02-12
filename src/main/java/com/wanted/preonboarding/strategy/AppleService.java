package com.wanted.preonboarding.strategy;

import com.wanted.preonboarding.strategy.dto.Apple;
import com.wanted.preonboarding.strategy.perdicate.PredicateFactory;
import com.wanted.preonboarding.strategy.perdicate.filter.ApplePredicate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppleService {
    private final PredicateFactory factory;

    public List<Apple> getFilteredAppleList(List<Apple> appleList, String className) {
        List<Apple> result = new ArrayList<Apple>();
        ApplePredicate predicate = factory.findBy(className);
        for (Apple apple : appleList) {
            if (predicate.filter(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
