package resignpattern.bridge;

/**
 * @author wxl
 * @version 1.0
 * @description: RMVB  具体实现化类
 * @date 2021/12/24 20:28
 */
public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("RMVB视频文件" + fileName);
    }
}
