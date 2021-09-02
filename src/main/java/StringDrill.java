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

}
