package Varargs;

public class C02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int sayi1=12;
        int sayi2=21;
        int sayi3=15;
        int sayi4=5;
        int sayi5=10;


        topla(sayi1, sayi2, sayi3, sayi4, sayi5);


    }

    private static void topla(int carpilacakSayi, int ...toplanacakSayilar) {
        int sayiTop=0;
        int sonuc=0;

        for (int each:toplanacakSayilar) {
            sayiTop+=each;

        }
        System.out.println("sonuc : " + sayiTop*carpilacakSayi);



    }
}