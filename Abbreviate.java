public class Abbreviate {
    public static void main(String[] args) {
        String word = args[0];
        if (word.length()<8){
            System.out.println(word+" | "+word);
        }else{
            System.out.println(word+" | "+word.substring(0,2)+"..."+word.substring(word.length()-2,word.length()));
        }
    }
}
