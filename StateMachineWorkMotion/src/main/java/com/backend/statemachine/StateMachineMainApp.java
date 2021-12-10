package com.backend.statemachine;

import com.backend.statemachine.domain.MainStatesPermit;
import com.backend.statemachine.domain.SubStatesPermit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.EnableStateMachine;

@SpringBootApplication
@EnableStateMachine
public class StateMachineMainApp implements CommandLineRunner {

    private final StateMachine<SubStatesPermit, MainStatesPermit> stateMachine;

    @Autowired
    public StateMachineMainApp(StateMachine<SubStatesPermit, MainStatesPermit> stateMachine) {
        this.stateMachine = stateMachine;
    }

    public static void main(String[] args) {
        SpringApplication.run(StateMachineMainApp.class, args);
    }

    @Override
    public void run(String... args) {
        stateMachine.start();
        stateMachine.sendEvent(MainStatesPermit.START);
        stateMachine.sendEvent(MainStatesPermit.FINISH);
        stateMachine.stop();
    }
}