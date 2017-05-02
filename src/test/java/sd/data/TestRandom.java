package sd.data;

import org.junit.Test;
import pro.tools.data.text.ToolRandoms;
import pro.tools.system.ToolClassSearch;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author SeanDragon
 *         Create By 2017-04-25 10:17
 */
public class TestRandom implements java.io.Serializable {
    public void doOne() {
        System.out.println(ToolRandoms.getAuthCodeAll(4));
        System.out.println(ToolRandoms.getAuthCodeAllChar());
        System.out.println(ToolRandoms.getAuthCodeNumber(4));
        System.out.println(Arrays.toString(ToolRandoms.getRandomRgb()));
        System.out.println(ToolRandoms.numberRandom(4));
        System.out.println(ToolRandoms.numberRandom(1, 4));
        System.out.println(ToolRandoms.getUuid(true));
        System.out.println(ToolRandoms.getUuid(false));
        System.out.println(ToolRandoms.getRandomStrByNanoTime(true));
        System.out.println(ToolRandoms.getRandomStrByNanoTime(false));
    }

    @Test
    public void test2() {
        for (int i = 0; i < 100; i++) {
            doOne();
        }
    }

    @Test
    public void test3() {
        System.out.println(ToolClassSearch.getAllClazz());
        System.out.println(ToolClassSearch.getClazzByInterface(Serializable.class));
    }
}