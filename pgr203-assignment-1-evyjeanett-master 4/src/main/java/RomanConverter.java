public class RomanConverter {
    static String toRoman(int number) {
        StringBuilder result = new StringBuilder();


        number = getNumber(number,result, 1000, "M");
        number = getNumber(number, result, 900, "CM");
        number = getNumber(number, result, 500, "D");
        number = getNumber(number, result, 400, "CD");
        number = getNumber(number,result, 100, "C");
        number = getNumber(number, result, 90, "XC");
        number = getNumber(number, result, 50, "L");
        number = getNumber(number, result, 40, "XL");
        number = getNumber(number, result, 10, "X");
        number = getNumber(number, result, 9, "IX");
        number = getNumber(number, result, 5, "V");
        number = getNumber(number, result,4,"IV");
        number = getNumber(number,result,1,"I");

        return result.toString();
    }

    private static int getNumber(int number, StringBuilder result, int digitValue, String digitSymbol) {
        while(number >= digitValue) {
            result.append(digitSymbol);
            number -= digitValue;
        }
        return number;
    }
}

