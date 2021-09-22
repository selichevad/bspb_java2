import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
        //создаются две строки, которые буду проверяться на анаграмму
        String str1 = " AisT anAgraMm one Y";
        String str2 = "InstAgrAm AA MoNeY";

        String s1 = str1.toLowerCase().replaceAll(" ", "");
        String s2 = str2.toLowerCase().replaceAll(" ", "");

        //сравнение длины строк после удаления всех пробелов
        if (s1.length() != s2.length()) {
            System.out.println("Строки \"" + str1 + "\" и \"" + str2 + "\" не являются анаграммой");
        }
        else {
            //перевод строк в массивы символов
            char[] char1 = s1.toCharArray();
            char[] char2 = s2.toCharArray();
            //сортировка массивов по символам
            Arrays.sort(char1);
            Arrays.sort(char2);
            //обратный перевод массивов в строки
            s1 = String.valueOf(char1);
            s2 = String.valueOf(char2);
            //сравнение новых строк с отсортированными символами
            if (s1.equals(s2)) {
                System.out.println("Строки \"" + str1 + "\" и \"" + str2 + "\" являются анаграммой");
            }
            else {
                System.out.println("Строки \"" + str1 + "\" и \"" + str2 + "\" не являются анаграммой");
            }
        }
    }

}
