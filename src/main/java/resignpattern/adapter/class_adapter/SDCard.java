package resignpattern.adapter.class_adapter;

/**
 * @author wxl
 * @version 1.0
 * @description: 目标接口
 * @date 2021/12/24 13:51
 */
public interface SDCard {

    //从SD卡中读取数据
    String readSD();

    //从SD卡中写数据
    void writeSD(String msg);
}
