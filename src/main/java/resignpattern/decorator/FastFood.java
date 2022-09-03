package resignpattern.decorator;

/**
 * @author wxl
 * @version 1.0
 * @description: 快餐类 抽象构件角色
 * @date 2021/12/24 19:37
 */
public abstract class FastFood {
    private float price;
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public abstract float cost();

}
