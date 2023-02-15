package by.belstu.it.krishtal.basejava;

import java.util.Arrays;

import static java.lang.Math.*;

public class JavaTest {
    /**
     * @return void
     * @throws JavaTest исключение
     * @param args - аргументы
     */
    public static void main(String[] args) {
        char char_variable = 'a';
        int int_variable = 5;
        short short_variable = 5;
        byte byte_variable = 127;
        long long_variable = 5;
        boolean boolean_variable = true;
        String string_variable = "String_variable";
        double double_variable = 8.5;
        var var1 = string_variable + int_variable;
        System.out.println(var1);
        System.out.println(string_variable + char_variable);
        System.out.println(string_variable + double_variable);
        //byte byte2_variable = byte_variable + int_variable;
        //int int2_variable = double_variable + long_variable;
        //long = int_variable + 2147483647;
        //static int sint;
        //System.out.println(sint);
        boolean_variable = true && true;
        boolean_variable = false ^ false;
        //boolean_variable = true + true;
        long_variable = 9223372036854775807L;
        long_variable = 0x7fff_ffff_fffL;
        char var_char_1 = 'a';
        char var_char_2 = '\u0061';
        char var_char_3 = 97;
        System.out.println("first=" + var_char_1 +"; second=" + var_char_2 +"; second=" + var_char_3);
        System.out.println(var_char_1 + var_char_2 + var_char_3);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));

        System.out.println(PI);
        System.out.println(E);
        System.out.println(round(PI));
        System.out.println(round(E));
        System.out.println(min(round(PI), round(E)));
        System.out.println(random()); // [0,1)

        Boolean bool1 = Boolean.valueOf(true);
        Character c1 = 'c';
        Byte b1 = -8;  //           1000 1000
        Short sh1 = 20;// 0000 0000 0001 0100
        Integer i1 = 55;
        Long l1 = 155L;
        Double d1 = 12.5;
        System.out.println(b1 >> 1);    // -4 = 1000 0100
        System.out.println(b1 >>> 1);   // 2147483644
        System.out.println(b1&sh1);     // 16 = 0001 0000
        System.out.println(b1|sh1);     // -4 = 1000 0100
        System.out.println(b1/i1);
        System.out.println(~l1);
        System.out.println(i1 + l1);

        /**
        * @value minimal value of long
        * @see long_max_value
        */
        Long long_min_value = Long.MIN_VALUE;


        Long long_max_value = Long.MAX_VALUE;
        Double double_min_value = Double.MIN_VALUE;
        Double double_max_value = Double.MAX_VALUE;


        Integer integer = 9;
        Byte byte_b = 2;
        // Упаковка

        int in = integer;
        byte byte_s = byte_b;
        // Распаковка

        System.out.println(Integer.parseInt("56"));
        System.out.println(Integer.toHexString(3711));
        System.out.println(Integer.compare(45, 78));
        String str1 = Integer.toString(-34);
        System.out.println(str1);
        System.out.println(Integer.bitCount(7));

        String s34 = "2345";

        int int34 = Integer.valueOf(s34);
        int int34_2 = Integer.parseInt(s34);

        byte[] bytes = s34.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes);
        String s34_2 = new String(bytes);
        System.out.println(s34_2);

        boolean bool34_1 = Boolean.valueOf(s34);
        boolean bool34_2 = Boolean.parseBoolean(s34);
        System.out.println("bool34_1=" + bool34_1 +"; bool34_2=" + bool34_2);

        String str_1 = "1369";
        String str_2 = "1369";
        System.out.println(str_1 == str_2);
        System.out.println(str_1.equals(str_2));
        System.out.println(str_1.compareTo(str_2));

        str_2 = null;
        System.out.println(str_1 == str_2);
        System.out.println(str_1.equals(str_2));
        //System.out.println(str_1.compareTo(str_2)); // нельзя null

        str_1 = "I am ok";
        String[] words = str_1.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(str_1.contains(" am"));
        System.out.println(str_1.hashCode());
        System.out.println(str_1.indexOf("ok"));
        System.out.println(str_1.length());

        char[][] c11;
        char[] c12[] = {{'c', '1'},{'2','A'}};
        char c13[][]= {{'C', '1', '3'},{'o', 'k'},{'l', 'a'}};
        c11 = new char[3][];
        c11[0] = new char[3];
        c11[1] = new char[4];
        c11[2] = new char[5];
        System.out.println(c11.length);
        System.out.println(c11[0].length);
        System.out.println(c11[1].length);
        System.out.println(c11[2].length);
        System.out.println("c12 == c13: " + (c12 == c13));
        c12 = c13;
        System.out.println("-------------------");
        for(char[] arr : c13) {
            for(char ch : arr) {
                System.out.println(ch);
            }
        }

        WrapperString wrapstr = new WrapperString();
        wrapstr.setString("Wrapper String");
        wrapstr.replace('W','Z');
        System.out.println(wrapstr.getString());

        WrapperString wrapstr_anonim = new WrapperString(){
            @Override
            public void replace(char oldchar, char newchar)
            {
                System.out.println("Replace from anonim");
            }
            public void delete(char newchar)
            {
                System.out.println("Delete from anonim");
            }
        };
        wrapstr_anonim.setString("Zrapper Anonim String");
        wrapstr_anonim.replace('Z', 'Z');
        //wrapstr_anonim.delete('s'); ?????????????????????????


    }
}
