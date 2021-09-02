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
            if( v.substring(i,subSize).equals(sub) ){
                nbOfOccurences++;
            }else{
                continue;
            }
        }


       return nbOfOccurences;
    }

}
