import java.lang.annotation.Target;

public class SearchInString {
    static boolean searchstring(String str,char ch){
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return true;
            }
        }
        //for each loop 
        // for(char st :str.toCharArray()){
        //     if(st==ch){
        //         return true;
        //     }
        // }
        return false;

    }
    public static void main(String[] args) {
        String name="Kartik";
        char target='a';
        System.out.println(searchstring(name, target));
        //System.out.println(Arrays.toString(name.toCharArray()));
    }
}
