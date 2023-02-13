import com.sun.jdi.IntegerValue;

public class StringReverser {

    public String[] reverse (String [] words){
        String [] reversed = new String[words.length];
        int j = reversed.length -1;
        for (String word : words) {
            reversed[j] = word;
            j--;
        }
        return reversed;
    }

    public void arrToString(String [] words){
        for (int i = 0; i < words.length; i++){
            System.out.print(words[i]);
        }
    }

    public static void main(String[] args) {
        String [] words = {"hello ", "World ", "hi "};
        StringReverser r = new StringReverser();
        r.arrToString(r.reverse(words));
        r.arrToString(words);
    }
}
