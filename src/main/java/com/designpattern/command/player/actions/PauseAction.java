package com.designpattern.command.player.actions;

import com.designpattern.command.player.IAction;
import com.designpattern.command.player.LHPlayer;

public class PauseAction implements IAction {

    private LHPlayer lhPlayer;

    public PauseAction(LHPlayer lhPlayer) {
        this.lhPlayer = lhPlayer;
    }

    public void execute() {
        lhPlayer.pause();
    }
}
