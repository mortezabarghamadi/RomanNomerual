public class RomanNumber {
    public String convert(int arabicnumber) {
        StringBuilder romanNumber= new StringBuilder();
        if(arabicnumber>=900){
            romanNumber.append("CM");
            arabicnumber-=900;
        }
        if (arabicnumber>=500) {
        romanNumber.append("D");
        arabicnumber-=500;
        }
        if(arabicnumber>=400){
            romanNumber.append("CD");
            arabicnumber-=400;
        }
        while (arabicnumber>=100){
            romanNumber.append("C");
            arabicnumber-=100;
        }
        if(arabicnumber>=90){
            romanNumber.append("XC");
            arabicnumber-=90;
        }
        if (arabicnumber>=50){
            romanNumber.append("L");
            arabicnumber-=50;
        }
        if(arabicnumber>=40){
            romanNumber.append("XL");
            arabicnumber-=40;
        }
        while (arabicnumber>=10){
            romanNumber.append("X");
            arabicnumber-=10;
        }
        if (arabicnumber==9) {
            romanNumber.append("IX");
            arabicnumber -= 9;
        }
        if (arabicnumber>=5) {
            romanNumber.append("V");
            arabicnumber-=5;
        }
        if(arabicnumber==4){
            romanNumber.append("IV");
            arabicnumber-=4;
        }
        for ( int index=0;index<arabicnumber;index++){
            romanNumber.append("I");
        }
        return romanNumber.toString();
    }}