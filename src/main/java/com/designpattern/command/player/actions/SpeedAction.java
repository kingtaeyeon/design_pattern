package com.designpattern.command.player.actions;

import com.designpattern.command.player.IAction;
import com.designpattern.command.player.LHPlayer;

public class SpeedAction implements IAction {

    private LHPlayer lhPlayer;

    public SpeedAction(LHPlayer lhPlayer) {
        this.lhPlayer = lhPlayer;
    }

    public void execute() {
        lhPlayer.speed();
    }
}
