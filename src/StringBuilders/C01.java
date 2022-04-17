package StringBuilders;

public class C01 {
    public static void main(String[] args) {
        /*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I
	        It is not a palindrome"

		 */

        //String cumle="Ey edip pide ye";
        String cumle="I love Java";

        StringBuilder str=new StringBuilder(cumle);
        str.reverse();
        String tersCumle= str.toString();
        System.out.println("Ters Cumle : "+tersCumle);

        if (cumle.equalsIgnoreCase(tersCumle)) {
            System.out.println("It is a palindrome");
        }else System.out.println("It is not a palindrome");

    }
}
