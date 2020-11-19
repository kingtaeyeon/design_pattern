package com.designpattern.command.player.actions;

import com.designpattern.command.player.IAction;
import com.designpattern.command.player.LHPlayer;

public class StopAction implements IAction {

    private LHPlayer lhPlayer;

    public StopAction(LHPlayer lhPlayer) {
        this.lhPlayer = lhPlayer;
    }

    public void execute() {
        lhPlayer.stop();
    }
}
