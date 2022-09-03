package resignpattern.adapter.class_adapter;

/**
 * @author wxl
 * @version 1.0
 * @description: 适配器类
 * @date 2021/12/24 13:55
 */
public class AdapterTF extends TFCardImpl implements SDCard {


    @Override
    public String readSD() {
        System.out.println("adapter read msg tf Card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write msg" + msg);
        writeTF(msg);
    }
}
