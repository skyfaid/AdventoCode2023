public class Main {
    public static void main(String[] args) {
        String ch= "String to test here please";
        int i=0;
        long s=0;
        int length=ch.length();
        while( i<length) {
            int j=ch.indexOf('\n');
            if(j ==-1) {
                System.out.println("problem:");
                break;
            }
            String hh = ch.substring(i, j);
            s = s + (finda(hh)*10+finda(new StringBuilder(hh).reverse().toString()));
            ch=ch.substring(j+1);
            i=0;
        }
        System.out.println("somme est = "+s);
    }

    public static long finda(String ch) {
        for (int i = 0; i < ch.length(); i++)
            if (Character.isDigit(ch.charAt(i)))
                 return Character.getNumericValue(ch.charAt(i));
        return 0;
    }

}