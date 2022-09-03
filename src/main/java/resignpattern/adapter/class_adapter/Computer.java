package resignpattern.adapter.class_adapter;

/**
 * @author wxl
 * @version 1.0
 * @description:计算机类
 * @date 2021/12/24 13:54
 */
public class Computer {
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}

