public class Abbreviate {
    public static void main(String[] args) {
        String word = args[0];
        if (word.length()<8){
            System.out.println(word+" | "+word);
        }
    }
}
