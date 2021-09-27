import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String[] fio = new String[] {"Иванов Денис Алексеевич", "Наумова Юлия Ильнична", "Артём Яковлев Игоревич",
                "Кравченко Камила Олеговна", "Сафин Зульфат Инокентьевич", "Борисов Дмитрий Дмитриевич",
                "Жукова Наталья Андреевна",
                "Йоханов Кирилл Кривихин",
                "Белкина Лида Алексеевна",
                "Попова Наталья Игоревна"};
        int[] age = new int[] {23,23,24,23,22,25,65,30,11,19};
        String[] gender = new String[] {"male","female","male","female","male","male","female","male","female","female"};

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                int temp_age;
                String temp_fio;
                String temp_gender;
                if (age[i] > age[j]) {
                    temp_age = age[i];
                    age[i] = age[j];
                    age[j] = temp_age;
                    temp_fio = fio[i];
                    fio[i] = fio[j];
                    fio[j] = temp_fio;
                    temp_gender = gender[i];
                    gender[i] = gender[j];
                    gender[j] = temp_gender;
                }
            }
        }

        String gender_result = "female";

        if (gender_result.equals("male")) {
            System.out.println("Мужчины:");
        }
        else {
            System.out.println("Женщины:");
        }
        for (int i = 0; i < 10; i++) {
            if (Objects.equals(gender[i], gender_result))
                System.out.println(fio[i] + " - " + age[i]);
        }
    }

}