public class ShortLongShort {
    public static void main(String[] args) {
        String word1 = args[0];
        String word2 = args[1];
        if (word1.length()>word2.length()){
            String newword = word2 + word1 + word2;
            System.out.println(newword);
        }else{
            String newword = word1 + word2 + word1;
            System.out.println(newword);
        }
    }
}
