package com.example.dependency.injection.constructor_injection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dependency.injection.constructor_injection.Coach.CoachInt;

@RestController
class CoachWorkoutController
{
    private final CoachInt mycoach;

    public CoachWorkoutController(CoachInt coach) {
        this.mycoach = coach;
    }

    @GetMapping("/hello")
    public String hello() {
        return "<h1>Get Workout for yaaa !!!!<h1>";
    }

    @GetMapping("/getWorkout")
    public String getWorkout() {
        return this.mycoach.getWorkout();
    }
    
}