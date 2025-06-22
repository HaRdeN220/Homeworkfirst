//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var hours = 640;
        var timePerson = 8;
        var person = (hours / timePerson) + 94;
        System.out.println("Если в компании работает " + person + " человека ,то всего " + (timePerson * person) + "" +
                " часов работы может быть поделено между сотрудниками.");
    }
}