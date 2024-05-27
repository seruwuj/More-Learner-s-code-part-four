public class Enumerations {
    public static void main(String[] args) {
        //Build a for Loop
        for(TunaEnumerations people: TunaEnumerations.values()){
        System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getyear());
    }
 }
}