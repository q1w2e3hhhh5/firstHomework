public class StringDrill {

    private String v;

    public StringDrill(String myStr) {
        this.v = myStr;
    }

    public boolean startsBy(String sub){
        if (v.substring(0,sub.length()).equals(sub)){
            return true;
        }else {
            return false;
        }
    }

    public int nbOfOccurences(String sub){

        int nbOfOccurences = 0;
        int subSize = sub.length();
        for(int i = 0 ; i < v.length() ; i++){
            if( i + subSize == v.length()){
                if (v.substring(v.length()-subSize).equals(sub)){
                    nbOfOccurences++;
                    break;
                }
            }
            if( v.substring(i,subSize+i).equals(sub) ){
                nbOfOccurences++;
            }
        }
       return nbOfOccurences;
    }

    public String subSplit(int n,String delim) {             //  bob,math,julien,gojo
        String str = "";
        int index = 0;
        int delimSize = delim.length();
        int firstMark = 0;
        int lastMark = 0;

        String test="";
        //code
        for (int i = 0; i < v.length(); i++) {
            if (v.substring(i,delimSize+i).equals(delim) ){
                index++;
                if(index == n){
                    System.out.println("hit first mark "+i);
                    firstMark = i +1;
                }
                if(index == n+1){
                    System.out.println("hit last mark "+i);
                    lastMark = i;
                }
            }
        }
        test=v.substring(firstMark,lastMark);
        System.out.println(test);
        return str;
    }
}
