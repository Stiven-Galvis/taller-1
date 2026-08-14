//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] alArray = {70, 12, 19, 56, 11, 3};
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

        misAlgoritmos.linearSearch(alArray,2) ;

        System.out.print(misAlgoritmos.linearSearch(alArray,11));
    }
}