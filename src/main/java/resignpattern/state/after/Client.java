package resignpattern.state.after;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 21:23
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.close();
        context.open();
        context.run();
        context.stop();

    }
}
