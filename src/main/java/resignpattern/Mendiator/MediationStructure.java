package resignpattern.Mendiator;

/**
 * @author wxl
 * @version 1.0
 * @description: 具体中介者
 * @date 2021/12/25 23:06
 */
public class MediationStructure extends Mediator{

    private HouseOwner houseOwner;

    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {

        if (person == houseOwner){
            System.out.println("收取中介费");
            tenant.getMessage(message);
        }else {
            System.out.println("收取中介费");
            houseOwner.getMessage(message);
        }
    }
}
