package ar.edu.unlp.info.oo2.rw.model;

public class SolarOvercraftRobotWithLasers extends NuclearOvercraftRobot
{
    public SolarOvercraftRobotWithLasers(String name) {
        super(name);
    }
    
     /**
     * This method is an exact replica of the one in class NuclearCaterpillarRobotWithBombs
     * THAT IS NOT GOOD!!
     */
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing lasers");
    }
}
