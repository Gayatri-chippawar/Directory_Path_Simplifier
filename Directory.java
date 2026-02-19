package Stack;

import java.util.Stack;

public class Directory {
    public static String getPath(String A){
        Stack<String> s = new Stack<>();
        String res = "";
        res+="/";
        int len_A = A.length();

        for (int i=0; i<len_A; i++){
            String dir = "";

            while (i<len_A && A.charAt(i)=='/'){
                i++;
            }
            while (i<len_A && A.charAt(i)!='/'){
                dir+=A.charAt(i);
                i++;
            }
            if(dir.equals("..")){
                if(!s.isEmpty()) {
                    s.pop();
                }
            }
            else if(dir.equals(".")){
                continue;
            }
            else if(!dir.isEmpty()){
                s.push(dir);
            }
        }
        Stack<String> stk = new Stack<>();
        while (!s.isEmpty()){
            stk.push(s.pop());
        }
        while (!stk.isEmpty()){
            if(stk.size()!=1){
                res+=stk.pop()+"/";
            }
            else{
                res+=stk.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/");
        System.out.println(getPath(str));
    }
}
