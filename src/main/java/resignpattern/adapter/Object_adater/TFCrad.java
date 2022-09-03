package resignpattern.adapter.Object_adater;

/**
 * @author wxl
 * @version 1.0
 * @description:适配者类接口
 * @date 2021/12/24 13:46
 */
public interface TFCrad {
    //从TF卡中读取数据
    String readTF();
    //往TF卡中写数据
    void writeTF(String msg);
}
