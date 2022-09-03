package resignpattern.bridge;

/**
 * @author wxl
 * @version 1.0
 * @description: 操作系统类 抽象化角色
 * @date 2021/12/24 20:30
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }
    public abstract void play(String fileName);
}
