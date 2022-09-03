package resignpattern.bridge;

/**
 * @author wxl
 * @version 1.0
 * @description: Mac操作系统 扩展抽象化角色
 * @date 2021/12/24 20:32
 */
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
