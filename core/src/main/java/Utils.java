public class Utils {

    StingUtils stingUtils = new StingUtils ();


    boolean isAllPositiveNumbers(String... str) {
        boolean result = false;
        if (stingUtils.isPositiveNumber(String.valueOf(str)) == true) {
            System.out.println("all numbers is positive");
            result = true;
        }
        return result;
    }
}

