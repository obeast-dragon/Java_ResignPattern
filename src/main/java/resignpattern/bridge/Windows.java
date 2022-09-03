package resignpattern.bridge;

/**
 * @author wxl
 * @version 1.0
 * @description: windows操作系统 扩展抽象化角色
 * @date 2021/12/24 20:32
 */
public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
