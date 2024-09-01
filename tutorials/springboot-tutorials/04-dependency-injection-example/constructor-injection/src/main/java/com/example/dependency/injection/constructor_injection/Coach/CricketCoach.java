package com.example.dependency.injection.constructor_injection.Coach;

import org.springframework.stereotype.Component;

/*
 * Component tells Spring Framework that this bean/class is ready for dependency injection
 */
@Component
public class CricketCoach implements CoachInt {

    @Override
    public String getWorkout() {
        return "<h2>Start with fielding</h2>";
    }
}
