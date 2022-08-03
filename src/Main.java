import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Первая задача:
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника - %s \n", fullName);
        //Вторая задача:
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //Третья задача:
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё", "е"));
    }
}