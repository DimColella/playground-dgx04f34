package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class TypeDeBaseTest {
    @Test
    public void test() {
        try {
            Assert.assertTrue(existsInFile("int i = 4;", new File("./src/main/java/com/yourself/TypeDeBase.java")));
            success(true);
        } catch (AssertionError | FileNotFoundException ae) {
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

    // check if a string exists in a text file
    private static boolean existsInFile(String str, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        try {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(str))
                    return true;
            }
            return false;
        } finally {
            scanner.close();
        }
    }
}
