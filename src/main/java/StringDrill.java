public class StringDrill {

    private String v;

    public StringDrill(String myStr) {
        this.v = myStr;
    }

    public boolean startsBy(String sub){
        if (v.startsWith(sub)){
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
        int index = 0;
        int firstMark = 0;
        int lastMark = 0;

        for (int i = 0; i < v.length(); i++) {
            if (v.startsWith(delim, i) ){
                index++;
                

                if(index == n){
                    System.out.println("first "+i);
                    firstMark = i +1;
                }
                if(index == n+1){
                    System.out.println("last "+i);
                    lastMark = i;
                }

            }
        }
        System.out.println(v.substring(firstMark,lastMark));
        return v.substring(firstMark,lastMark);
    }
}
