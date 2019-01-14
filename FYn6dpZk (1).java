public class Main {

    //Все, что закомменчено - только для вас, одногруппники!
    //УДАЛИТЕ ВСЕ КОММЕНТЫ, ЧТОБЫ НЕ ПОЛУЧИТЬ ПИЗДЮЛЕЙ ОТ ПРЕПОДА!!!

    //Это главный МЕТОД, запускающий вашу программу
    public static void main(String[] args) {

        //Первое задание - выводим Hello world (Замените текст, если хотите)
        System.out.println("Hello world");

        //ЗАМЕНИТЕ СТРОЧКУ НА ДРУГУЮ, УНИКАЛЬНУЮ
        //Проверка на палиндром (Вводим НЕ палиндром)
        System.out.println(isPalindrome("Привет"));

        //ЗАМЕНИТЕ СТРОЧКУ НА ДРУГУЮ, УНИКАЛЬНУЮ
        //Проверка на палиндром (Вводим палиндром)
        System.out.println(isPalindrome("хух"));

        //Обычный цикл от 0 до 100
        for (int i = 0; i < 100; i++) {
            //Если число простое - выводим его
            if (isPrime(i))
                System.out.println(i);
        }
    }

    //Простой способ нахождения палиндрома
    public static boolean isPalindrome(String string) {
        //Создаем инстанс класса StringBuilder, передаем в него нашу строку,
        //вызываем в нем метод .reverse(), который переворачивает строчку и
        //методом .equals() сравниваем обе строки, если они одинаковы - это палиндром!
        return new StringBuilder(string).reverse().toString().equals(string);
    }

    //Проверка числа средствами Java (Без написания циклов)
    public static boolean isPrime(final int num) {
        //Тут шок контент происходит, но я не нашел, работающих на циклах, нормальный алгоритм!
        return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
    }
}