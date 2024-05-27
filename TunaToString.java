public class TunaToString {
    private String name;
    //reference to TunaBuilder
    private TunaBuilder birthday;

    public TunaToString(String theName,TunaBuilder theDate){
           name = theName;
           birthday = theDate;
    }
           public String toString(){
            return String.format("My name is %s, My Birthday is %s",name,birthday);

           }
    }

