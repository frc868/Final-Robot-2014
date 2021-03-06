/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techhounds.commands.driving;

import com.techhounds.commands.CommandBase;
import com.techhounds.subsystems.DriveSubsystem;

/**
 *
 * @author TechHOUNDS
 */
public class DriveWithGyro extends CommandBase {
    
    DriveSubsystem drive;
    
    public DriveWithGyro() {
        drive = DriveSubsystem.getInstance();
        requires(drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        drive.driveWithGyro();
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
    }
}
