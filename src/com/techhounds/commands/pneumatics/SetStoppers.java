/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techhounds.commands.pneumatics;

import com.techhounds.commands.CommandBase;
import com.techhounds.subsystems.StopperSubsystem;

/**
 *
 * @author Atif Niyaz
 */
public class SetStoppers extends CommandBase {
    
    public StopperSubsystem stopper;
    
    private boolean position;
    private boolean isToggling;
    
    public SetStoppers() {
        stopper = StopperSubsystem.getInstance();
        requires(stopper);
        isToggling = true;
    }
    
    public SetStoppers(boolean position) {
        this();
        this.position = position;
        isToggling = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        if(isToggling) {
            position = !stopper.getStopperPosition();
        }
        
        stopper.setStopperPosition(position);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
