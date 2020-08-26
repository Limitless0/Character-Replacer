package com.abanoub.CharReplacer;

//import static com.abanoub.CharReplacer
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class charReplace {
    public static Scanner scan;
    public static File file = new File("./Character Replacer Library.txt");
    static char[][] replacementArray;

    public static void openFile() {
        try {
            scan = new Scanner(file);
        } catch (Exception e) {
            try {
                file.createNewFile();
            } catch (IOException ioException) {
                ioException.printStackTrace();
                return;
            }
        }
        replacementArray = new char[(int) file.length()][2];
        int ii = 0;
        while (scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println(str);
            String[] splitString = str.split(" ", 2);
            System.out.println(Arrays.toString(splitString));
            char[] chars = {splitString[0].charAt(0), splitString[1].charAt(0)};
            System.out.println(chars);
            replacementArray[ii] = chars;
            ii++;
        }
    }

    public static String replace(String str) {

        char[] chars = str.toCharArray();
        for (int ii = 0; ii < chars.length; ii++) {
            for (int jj = 0; jj < replacementArray.length; jj++) {

                if (chars[ii] == replacementArray[jj][0]) {
                    chars[ii] = replacementArray[jj][1];
                }
            }


        }
        String strOut = String.valueOf(chars);

        System.out.println(strOut);
        return strOut;

    }
}
