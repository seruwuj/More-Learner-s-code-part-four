public class CreatingObjects {
    public static void main(String[] args) {
        TunaCreating tunaCreatingObject = new TunaCreating();
        TunaCreating tunaCreatingObject2 = new TunaCreating(5);
        TunaCreating tunaCreatingObject3 = new TunaCreating(5, 13);
        TunaCreating tunaCreatingObject4 = new TunaCreating(5, 13, 43);

        System.out.printf("%s\n", tunaCreatingObject.toMilitary());
        System.out.printf("%s\n", tunaCreatingObject2.toMilitary());
        System.out.printf("%s\n", tunaCreatingObject3.toMilitary());
        System.out.printf("%s\n", tunaCreatingObject4.toMilitary());
    }
}
