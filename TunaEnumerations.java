import java.time.Year;

public enum TunaEnumerations {
    Tinah("Beutiful", "18"),
    Maishara("Royal","19"),
    Serah("Clumsy","22");

    //Two variables that represent two arguments
    private final String desc;
    private final String year;

    //Build a constructor
    TunaEnumerations(String description, String birthday){
        desc = description;
        year = birthday;
    }
    public String getDesc(){
        return desc;
    }
    public String getyear(){
      return year;
    }
}
