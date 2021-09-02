public class StringDrill {

    private String v;

    public StringDrill(String myStr) {
        this.v = myStr;
    }

    public boolean startsBy(String sub){
        System.out.println(v.substring(0,0));
        if (v.substring(0,1).equals(sub)){
            return true;
        }else
            return false;
    }



}
