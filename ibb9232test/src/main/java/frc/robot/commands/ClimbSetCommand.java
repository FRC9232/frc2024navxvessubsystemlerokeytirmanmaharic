package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimbSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



public class ClimbSetCommand extends Command {
    
    private final ClimbSubsystem climbSubsystem;
    private int open;
    private boolean finished;

    
    public ClimbSetCommand(ClimbSubsystem climbSubsystem, int open){
        this.climbSubsystem = climbSubsystem;
        this.open = open;
        addRequirements(climbSubsystem);
    }
    public void execute(){
        
        finished = false;
        switch(open){
            case 1:
                
                climbSubsystem.setClimb(1);
                finished = true;
                break;
            case 0:
                climbSubsystem.setClimb(0);
                finished = true;
                break;
            case -1:
                climbSubsystem.setClimb(-1);
                finished = true;
                break;
        }
        isFinished();
        
    }
    
    @Override
    public boolean isFinished() {
        return finished;
    }
    













 }