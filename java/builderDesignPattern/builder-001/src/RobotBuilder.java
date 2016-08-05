/**
 * Created by ibarra on 8/4/16.
 */
public interface RobotBuilder {

    public void buildRobotHead();
    public void buildRobotTorso();
    public void buildRobotArms();
    public void buildRobotLegs();

    public Robot getRobot();
}
