import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String args[])
    {
        int numberToConvert = 10;
        System.out.println(integerToRoman(numberToConvert));
    }
    public static String integerToRoman(int number)
    {   String result = new String();
        Map<Integer, String> intToRomanMap = new HashMap<>();
        intToRomanMap.put(1,"I");
        intToRomanMap.put(2,"II");
        intToRomanMap.put(3,"III");
        intToRomanMap.put(4,"IV");
        intToRomanMap.put(5,"V");
        intToRomanMap.put(6,"VI");
        intToRomanMap.put(7,"VII");
        intToRomanMap.put(8,"VIII");
        intToRomanMap.put(9,"IX");


        int countM = number/1000;
        number = number%1000;

        int countCM = number/900;
        if(countCM!=0)
            number = number%900;

        int countD = number/500;
        number = number%500;

        int countCD = number/400;
        if(countCD!=0)
            number = number%400;

        int countC = number/100;
        number = number%100;

        int countXC= number/90;
        if(countXC!=0)
            number = number%90;

        int countL = number/50;
        number = number%50;

        int countXL= number/40;
        if(countXL!=0)
            number = number%40;

        int countX = number/10;
        number = number%10;
        while(countM>0)
        {
            result+="M"; //1000
            countM--;
        }
        while(countCM>0){
            result+="CM";
            countCM--;
        }
        while(countD>0) {
            result +="D"; //500
            countD--;
        }
        while(countCD>0){
            result+="CD";
            countCD--;
        }
        while(countC>0) {
            result +="C"; //100
            countC--;
        }
        while(countXC>0){
            result+="XC";
            countXC--;
        }
        while(countL>0) {
            result +="L"; //50
            countL--;
        }
        while(countXL>0){
            result+="XL";
            countXL--;
        }
        while(countX>0) {
            result +="X"; //10
            countX--;
        }
        if(number>0)
        result+=intToRomanMap.get(number);

        return result;
    }
}
