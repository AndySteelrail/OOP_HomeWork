package org.home_work6.view;

public class InitializationView {
    public void printHelloMessage() {
        System.out.println("Для игры быки и коровы, введите стартовые настройки:");
    }
    public void requestWorldSize() {
        System.out.println("Введите длину слова:");
    }
    public void requestTryCount() {
        System.out.println("Введите количество попыток:");
    }
    public void requestGameType() {
        System.out.println("Введите режим игры, с учётом регистра,\n" +
                "где C - кириллическое слово, L - латиница, " +
                "а также числа во всех остальных случаях"
        );
    }
}
