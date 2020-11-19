package com.designpattern.command.player;

import com.designpattern.command.player.IAction;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<IAction> actions = new ArrayList<IAction>();

    public void addAction(IAction action) {
        actions.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void executes() {
        for(IAction action : actions) {
            action.execute();
        }
    }

}
