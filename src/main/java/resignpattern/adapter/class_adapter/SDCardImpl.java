package resignpattern.adapter.class_adapter;

/**
 * @author wxl
 * @version 1.0
 * @description: 目标接口类
 * @date 2021/12/24 13:53
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard read msg hello SDCard";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("write msg" + msg);
    }
}
