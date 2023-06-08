import java.util.Scanner;

public class Main {
    private static final String ADMIN_PASSWORD = "1111";
    private static final String[] QUESTIONS = {
            "1. Як написати число 5 англійською мовою?\n" +
                    "a) Five\n" +
                    "b) Four\n" +
                    "c) Six\n" +
                    "d) Seven",
            "2. Як написати число 10 англійською мовою?\n" +
                    "a) Twelve\n" +
                    "b) Eight\n" +
                    "c) Ten\n" +
                    "d) Fifteen",
            "3. Як написати число 12 англійською мовою?\n" +
                    "a) Twelve\n" +
                    "b) Eight\n" +
                    "c) Ten\n" +
                    "d) Fifteen",
            "4. Як написати число 1 англійською мовою?\n" +
                    "a) Twelve\n" +
                    "b) Eight\n" +
                    "c) One\n" +
                    "d) Fifteen",
            "5. Як написати перший англійською мовою?\n" +
                    "a) Twelve\n" +
                    "b) first\n" +
                    "c) Ten\n" +
                    "d) Fifteen",
            // Додайте інші питання тут
    };
    private static final String[] ANSWERS = {"a", "c","a","c","b"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ласкаво просимо до тестування!");
        System.out.println("Введіть 'q' у будь-який момент для завершення.");

        String input;
        int score = 0;
        int questionIndex = 0;

        while (questionIndex < QUESTIONS.length) {
            System.out.println(QUESTIONS[questionIndex]);
            input = scanner.nextLine().toLowerCase();

            if (input.equals("q")) {
                break;
            } else if (input.equals("a") || input.equals("b") || input.equals("c") || input.equals("d")) {
                if (input.equals(ANSWERS[questionIndex])) {
                    score++;
                }
                questionIndex++;
            } else {
                System.out.println("Ви ввели невірну відповідь. Будь ласка, спробуйте ще раз.");
            }
        }

        double percentage = (double) score / QUESTIONS.length * 100;
        System.out.println("Тестування завершено!");
        System.out.println("Ваш результат: " + percentage + "% правильних відповідей.");

        System.out.println("Введіть пароль для перегляду правильних відповідей (або введіть 'q' для виходу):");
        String password = scanner.nextLine();

        if (password.equals(ADMIN_PASSWORD)) {
            System.out.println("Правильні відповіді:");
            for (int i = 0; i < QUESTIONS.length; i++) {
                System.out.println(QUESTIONS[i]);
                System.out.println("Правильна відповідь: " + ANSWERS[i]);
                System.out.println();
            }
        } else if (!password.equals("q")) {
            System.out.println("Невірний пароль. Вихід з програми.");
        }
    }
}