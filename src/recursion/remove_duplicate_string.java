package recursion;

public class remove_duplicate_string {
    public static void removeDublicates(String str,int idx ,StringBuilder newstr,boolean[] map){
        if(idx==str.length()) {
            System.out.println(newstr);
            return;
        }

        char currChar= str.charAt(idx);
        if(map[currChar-'a']){
            removeDublicates(str,idx+1,newstr,map);
        }
        else {
            map[currChar-'a']=true;
            removeDublicates(str,idx+1,newstr.append(currChar),map);
        }
    }

    public static void main(String[] args) {
        String str="acbbbgbgcdb";
        StringBuilder sb=new StringBuilder();
        removeDublicates(str,0,sb,new boolean[26]);
    }
}
