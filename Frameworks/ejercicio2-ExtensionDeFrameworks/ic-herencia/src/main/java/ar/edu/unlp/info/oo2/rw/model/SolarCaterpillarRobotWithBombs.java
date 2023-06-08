package ar.edu.unlp.info.oo2.rw.model;

public class SolarCaterpillarRobotWithBombs extends NuclearCaterpillarRobot
{
    public SolarCaterpillarRobotWithBombs(String name) {
        super(name);
    }
    
    /**
     * This method is an exact replica of the one in class NuclearOvercraftRobotWithBombs
     * THAT IS NOT GOOD!!
     */
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing bombs");
    }
}
