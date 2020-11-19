package com.designpattern.command.player.actions;

import com.designpattern.command.player.IAction;
import com.designpattern.command.player.LHPlayer;

public class PlayAction implements IAction {

    private LHPlayer lhPlayer;

    public PlayAction(LHPlayer lhPlayer) {
        this.lhPlayer = lhPlayer;
    }

    public void execute() {
        lhPlayer.play();
    }
}
