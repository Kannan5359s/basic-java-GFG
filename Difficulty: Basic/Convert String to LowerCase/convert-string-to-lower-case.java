// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
        StringBuilder r=new StringBuilder() ;
        for(char ch:s.toCharArray()){
            int ascii=(int)ch;
            if (64< ascii && ascii <93){
                int low=ascii+32;
                r.append((char)low);
                
            }else{
                r.append(ch);
            }
            
        }
        return r.toString();
        
    }
}