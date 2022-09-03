package resignpattern.Jvm;

import java.util.ArrayList;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2021/12/30 0:05
 */
public class HeapTest {
    byte[] a = new byte[1024 * 100]; //100KB

    public static void main(String[] args) throws Exception{
        ArrayList<HeapTest> heapTests = new ArrayList<>();
        while (true) {
            heapTests.add(new HeapTest());
            Thread.sleep(10);
        }
    }
}
