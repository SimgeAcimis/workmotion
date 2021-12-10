package com.backend.statemachine.config;

import com.backend.statemachine.domain.MainStatesPermit;
import com.backend.statemachine.domain.SubStatesPermit;
import com.backend.statemachine.listener.Listener;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.util.EnumSet;

@Configuration
@EnableStateMachine
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter<SubStatesPermit, MainStatesPermit> {
    @Override
    public void configure(StateMachineStateConfigurer<SubStatesPermit, MainStatesPermit> states) throws Exception {
        states.withStates()
                .initial(SubStatesPermit.WORK_PERMIT_CHECK_STARTED)
                .states(EnumSet.allOf(SubStatesPermit.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<SubStatesPermit, MainStatesPermit> transitions) throws Exception {
        transitions
                .withExternal()
                .source(SubStatesPermit.WORK_PERMIT_CHECK_STARTED)
                .target(SubStatesPermit.WORK_PERMIT_CHECK_FINISHED)
                .event(MainStatesPermit.FINISH);
    }

    @Override
    public void configure(StateMachineConfigurationConfigurer<SubStatesPermit, MainStatesPermit> config) throws Exception {
        config.withConfiguration()
                .autoStartup(true)
                .listener(new Listener());
    }
}
