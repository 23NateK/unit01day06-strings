public class NegatePhrase {
    public static void main(String[] args) {
        String phrase = args[0];
        if (phrase.substring(0,3).equals("not")){
            System.out.println(phrase);
        }else{
            String newstring = "not " + phrase;
            System.out.println(newstring);
        }
    }
}
