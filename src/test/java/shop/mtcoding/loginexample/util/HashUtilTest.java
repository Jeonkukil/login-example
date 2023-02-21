package shop.mtcoding.loginexample.util;

import org.junit.jupiter.api.Test;

public class HashUtilTest {
    @Test
    public void encodePasswordTest() throws Exception {
        System.out.println("테스트 : " + HashUtil.encodePassword("1111"));

    }
}
