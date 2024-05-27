public class ToString {
    public static void main(String[] args) {
        TunaBuilder TunaBuilderObject= new TunaBuilder(4,5,6);
        TunaToString TunaToStringObject = new TunaToString("Seruwu",TunaBuilderObject);

        System.out.println(TunaToStringObject);
    }
}
