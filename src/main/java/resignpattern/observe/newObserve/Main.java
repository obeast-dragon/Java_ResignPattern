package resignpattern.observe.newObserve;




public class Main {

    public static void main(String[] args) {

        Demo demo = new Demo();

        demo.addPropertyChangeListener(evt -> {

            System.out.println("OldValue:" + evt.getOldValue());

            System.out.println("NewValue:" + evt.getNewValue());

            System.out.println("tPropertyName:" + evt.getPropertyName());

        });

        demo.setName("鸡");

    }

}