package resignpattern.bulider.demo1;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/24 0:49
 */
public class Phone {

    private String CPU;
    private String screen;
    private String memory;
    private String mainBoard;

    private Phone(Builder builder){
        this.CPU = builder.CPU;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "CPU='" + CPU + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }

    public static final class Builder{
        private String CPU;
        private String screen;
        private String memory;
        private String mainBoard;

        public Builder() {
        }

        public Builder cpu(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }
}
