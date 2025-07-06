public class Array {
    public static void main(String[] args) {
        String[] names = {"Nasser", "Haitham", "Manal", "Hanin"};

        String reversed = " ";

        for (String str : names) {
            String reverse = new StringBuilder(str).reverse().toString();
            System.out.print(" "+reverse);
        }
    }
}

