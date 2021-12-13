import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        boolean value = test();
        System.out.println(value);;
    }

    private boolean test(){
        String s = "abbbbba";
        boolean seenB= false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                if(seenB)
                    return false;
            }
            if(s.charAt(i) == 'b'){
                seenB = true;
            }
        }
        return true;
    }
}
