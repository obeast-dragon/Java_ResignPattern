package resignpattern.state.after;

/**
 * @author wxl
 * @version 1.0
 * @description: 环境角色
 * @date 2021/12/25 20:58
 */
public class Context {
    public static final OpeningState OPENING_STATE = new OpeningState();
    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final StoppingState STOPPING_STATE = new StoppingState();
    public static final RunningState RUNNING_STATE = new RunningState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }


    public void close() {
        this.liftState.close();
    }


    public void run() {
        this.liftState.run();
    }


    public void stop() {
        this.liftState.stop();

    }
}


