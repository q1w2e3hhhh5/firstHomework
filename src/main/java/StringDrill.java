public class StringDrill {

    private String v;

    public StringDrill(String myStr) {
        this.v = myStr;
    }

    public boolean startsBy(String sub){
        if (v.substring(0).equals(sub)){
            return true;
        }else
            return false;
    }



}
