package resignpattern.Mendiator;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/25 23:17
 */
public class Client {
    public static void main(String[] args) {
        MediationStructure mediationStructure = new MediationStructure();

        Tenant tenant = new Tenant("张三",mediationStructure);
        HouseOwner houseOwner = new HouseOwner("王五",mediationStructure);
        mediationStructure.setHouseOwner(houseOwner);
        mediationStructure.setTenant(tenant);

        tenant.constact("你有好房");
        houseOwner.constact("我有，要吗");

    }
}
