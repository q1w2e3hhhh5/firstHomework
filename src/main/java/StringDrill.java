public class StringDrill {

    private String v;

    public StringDrill(String myStr) {
        this.v = myStr;
    }

    public boolean startsBy(String sub){

        if (sub==(null) || sub.equals("")){
            throw new IllegalArgumentException("sub cannot be null or empty");
        }

        if (v.startsWith(sub)){
            return true;
        }else {
            return false;
        }
    }

    public int nbOfOccurences(String sub){

        if (sub==(null) || sub.equals("") || sub.length() > v.length()){
            throw new IllegalArgumentException("sub cannot be null, empty or larger than the str");
        }

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
        int nextMark = 0;
        //int lastMark = 0;

        if (delim==(null) || delim.equals("") || n<0){
            throw new IllegalArgumentException("delim cannot be null or empty and n cannot be negative");
        }

        for (int i = 0; i < v.length(); i++) {
            if (v.startsWith(delim, i) ){
                index++;
                if(index == n){
                    firstMark = i +1;
                }

                //code how to get only the last element

                if(index == n+1){
                    nextMark = i;
                }
            }
        }
        return v.substring(firstMark,nextMark);
    }
}
