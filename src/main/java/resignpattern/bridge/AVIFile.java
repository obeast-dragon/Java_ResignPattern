package resignpattern.bridge;

/**
 * @author wxl
 * @version 1.0
 * @description: AVI视频文件 具体实现化类
 * @date 2021/12/24 20:27
 */
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("AVI视频文件" + fileName);
    }
}
