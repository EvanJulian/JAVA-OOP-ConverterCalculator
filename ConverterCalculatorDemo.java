import static java.lang.System.*;
public class ConverterCalculatorDemo {
    public static void main(String[] args) {
        int number = 20000;
        out.println(ConvertCalculator.convertToBinary(number));
        out.println(ConvertCalculator.convertToHexa(number));
        out.println(ConvertCalculator.convertToOcta(number));
    
        String string1 = "FF";
        out.println(ConvertCalculator.convertHexaToDecimal(string1));
        String string2 = "256a";
        out.println(ConvertCalculator.convertHexaToDecimal(string2));
        String string3 = "1112";
        try{
            out.println(ConvertCalculator.convertBinaryToDecimal(string3));
        }
        catch(NumberFormatException e){
            out.println("0");
        }
        String string4 = "110011001111";
        try{
            out.println(ConvertCalculator.convertBinaryToDecimal(string4));
        }
        catch(NumberFormatException e){
            out.println("0");
        }
    }
}