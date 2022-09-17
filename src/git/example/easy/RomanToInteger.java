package git.example.easy;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("XXVII"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            String symbol = s.substring(i,i+1);
            if (i != s.length() -1) {
                String symbols = s.substring(i, i+2);
                if ( symbols.equals("IV") || symbols.equals("IX") || symbols.equals("XL") ||
                        symbols.equals("XC") ||  symbols.equals("CD") || symbols.equals("CM")) {
                    result += convertToInteger(symbols);
                    i++;
                    continue;
                }
            }
            result += convertToInteger(symbol);
        }
        return result;
    }

    private static int convertToInteger(String symbol) {
        if (symbol.equalsIgnoreCase("I"))
            return 1;
        if (symbol.equalsIgnoreCase("IV"))
            return 4;
        if (symbol.equalsIgnoreCase("V"))
            return 5;
        if (symbol.equalsIgnoreCase("IX"))
            return 9;
        if (symbol.equalsIgnoreCase("X"))
            return 10;
        if (symbol.equalsIgnoreCase("XL"))
            return 40;
        if (symbol.equalsIgnoreCase("L"))
            return 50;
        if (symbol.equalsIgnoreCase("XC"))
            return 90;
        if (symbol.equalsIgnoreCase("C"))
            return 100;
        if (symbol.equalsIgnoreCase("CD"))
            return 400;
        if (symbol.equalsIgnoreCase("D"))
            return 500;
        if (symbol.equalsIgnoreCase("CM"))
            return 900;
        if (symbol.equalsIgnoreCase("M"))
            return 1000;
        return 0;
    }
}
