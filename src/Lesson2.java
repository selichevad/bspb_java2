import java.util.Objects;

public class Lesson2 {

    public static void main(String[] args) {
        String[] fio = new String[] {"Иванов Иван Иванович",
                "Иванова Инна Семеновна",
                "Петров Василий Владимирович",
                "Смирнова Кристина Ивановна",
                "Программистов Тестер Аналитикович",
                "Кузьмич Павел Сергеевич",
                "Умная Виктория Петровна",
                "Хитрый Олег Михайлович",
                "Веселая Валерия Дмитриевна",
                "Забавная Ксения Александровна"};
        int[] age = new int[] {20,35,47,29,18,42,31,53,26,21};
        String[] gender = new String[] {"male","female","male","female","male","male","female","male","female","female"};

        //сортировка по увеличению возраста
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

        //задаём пол для вывода информации, варианты - "male" , "female"
        String gender_result = "female";

        //вывод информации
        if (gender_result.equals("male")) {
            System.out.println("Список мужчин по увеличению возраста:");
        }
        else {
            System.out.println("Список женщин по увеличению возраста:");
        }
        for (int i = 0; i < 10; i++) {
            if (Objects.equals(gender[i], gender_result))
                System.out.println("ФИО - " + fio[i] + ", возраст - " + age[i]);
        }
    }

}