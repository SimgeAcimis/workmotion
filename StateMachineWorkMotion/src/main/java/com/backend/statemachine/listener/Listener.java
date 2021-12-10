package com.backend.statemachine.listener;

import com.backend.statemachine.domain.MainStatesPermit;
import com.backend.statemachine.domain.SubStatesPermit;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

public class Listener extends StateMachineListenerAdapter<SubStatesPermit, MainStatesPermit> {
    @Override
    public void stateChanged(State<SubStatesPermit, MainStatesPermit> from, State<SubStatesPermit, MainStatesPermit> to) {
        System.out.println("state changed from " + to.getId());
    }
}