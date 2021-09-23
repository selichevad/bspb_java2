import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {
        //создаются две строки, которые буду проверяться на анаграмму
        String str1 = " AisT anAgraMm one Y ";
        String str2 = "InstAgrAm Aa  MoNeY";

        String s1 = str1.toLowerCase().replaceAll(" ", "");
        String s2 = str2.toLowerCase().replaceAll(" ", "");
        boolean isAnagram = false;

        //условие равенства длины строк после преобразований
        if (s1.length() == s2.length()) {
            //перевод строк в массивы символов
            char[] char1 = s1.toCharArray();
            char[] char2 = s2.toCharArray();

            //сортировка массивов по символам
            Arrays.sort(char1);
            Arrays.sort(char2);

            //проверка являются ли строки анаграммами
            isAnagram = Arrays.equals(char1, char2);
        }

        //вывод результата проверки
        if (isAnagram) {
            System.out.println("Строки \"" + str1 + "\" и \"" + str2 + "\" являются анаграммой");
        }
        else {
            System.out.println("Строки \"" + str1 + "\" и \"" + str2 + "\" не являются анаграммой");
        }
    }

}
