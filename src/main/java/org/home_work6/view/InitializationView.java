package org.home_work6.view;

public abstract class InitializationView {
    public static void printSetStartMessage() {
        System.out.println("Для игры быки и коровы, введите стартовые настройки:");
    }
    public static void requestWorldSize() {
        System.out.println("Введите длину слова:");
    }
    public static void requestTryCount() {
        System.out.println("Введите количество попыток:");
    }
    public static void requestGameType() {
        System.out.println("""
                Введите режим игры, с учётом регистра,
                где C - кириллическое слово, L - латиница, а также числа во всех остальных случаях"""
        );
    }
}
