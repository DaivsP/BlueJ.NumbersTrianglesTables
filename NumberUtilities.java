


public class NumberUtilities {

    public static String getRange(int stop) {
        String String = "";
        for (int i = 0; i < stop; i++){
            String += i;
    }
    return String;
}
    public static String getRange(int start, int stop) {
        String String = "";
        for (int i = start; i < stop; i++){
         String += i;   
        }
        return String;
    }


    public static String getRange(int start, int stop, int step) {
        String String = "";
        for (int i = start; i < stop; i += step){
         String += i;   
        }
        return String;
    }

    public static String getEvenNumbers(int start, int stop) {
        String String = "";
        if(start % 2 == 1){
            start++;
        }
        for (int i = start; i < stop; i += 2){
            String += i;
        }
        return String;
    }


    public static String getOddNumbers(int start, int stop) {
        String String = "";
        if(start % 2 == 0){
            start++;
        }
        for (int i = start; i < stop; i += 2){
            String += i;
        }
        return String;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String String = "";
        for (int i = start; i < (stop + 1); i++){
            double d = Math.pow(i, exponent);
            String = String + (int)d;
        }
        return String;
    }
}
