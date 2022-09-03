package resignpattern.adapter.class_adapter;

/**
 * @author wxl
 * @version 1.0
 * @description:适配者类
 * @date 2021/12/24 13:48
 */
public class TFCardImpl implements TFCrad{
    @Override
    public String readTF() {
        String msg = "TFCard read msg hello TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("write msg" + msg);
    }
}
