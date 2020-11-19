package com.designpattern.command.player;

import com.designpattern.command.player.actions.PauseAction;
import com.designpattern.command.player.actions.PlayAction;
import com.designpattern.command.player.actions.SpeedAction;
import com.designpattern.command.player.actions.StopAction;

public class Test {

    public static void main(String[] args) {
        LHPlayer player = new LHPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));
        controller.addAction(new PauseAction(player));
        controller.addAction(new StopAction(player));
        controller.addAction(new SpeedAction(player));
        controller.executes();
    }
}
