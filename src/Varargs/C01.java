package Varargs;

public class C01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String s1="m";
        String s2="e";
        String s3="r";
        String s4="v";
        String s5="e";

        isimBirlestirme(s1,s2,s3,s4,s5);


    }

    private static void isimBirlestirme(String ...str) {
        String isim="";
        for (String h:str) {

            isim=isim.concat(h);


        }
        System.out.println(isim);
    }


}
