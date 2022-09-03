package resignpattern.state.before;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 20:45
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.RUNNING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
