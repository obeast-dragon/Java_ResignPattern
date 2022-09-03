package resignpattern.adapter.Object_adater;

/**
 * @author wxl
 * @version 1.0
 * @description: 适配器类
 * @date 2021/12/24 13:55
 */
public class AdapterTF implements SDCard {

    private TFCrad tfCrad;

    public AdapterTF(TFCrad tfCrad) {
        this.tfCrad = tfCrad;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read msg tf Card");
        return tfCrad.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write msg" + msg);
        tfCrad.writeTF(msg);
    }
}
