package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class TypeDeBaseTest {
    @Test
    public void test() {
        try {
            Assert.assertEquals("Execution de la création d'un entier de valeur 4", 4, TypeDeBase.simpleEntier());
            success(true);
        } catch (Exception ex) {
            msg("Aïe", "La création de la variable n'est pas correcte... réessayez");
            success(false);
        }

    }

    private static void success(boolean success) {
        System.out.println(String.format("TECHIO> success %s", success));
    }

    private static void msg(String channel, String msg) {
        System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
    }
}
