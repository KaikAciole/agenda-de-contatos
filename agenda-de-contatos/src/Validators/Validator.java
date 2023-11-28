package Validators;

import java.util.Scanner;

public abstract class Validator<T> {
    public abstract boolean validate(T data);

    public T getValidValue(String prompt, String errorMsg, Class<T> type) {
        T data = null;
        Scanner sc = new Scanner(System.in);

        while (data == null) {
            System.out.print(prompt);
            if (type == String.class) {
                data = (T) sc.nextLine();
            } else if (type == Integer.class) {
                data = (T) Integer.valueOf(sc.nextInt());
                sc.nextLine();
            }

            if (!this.validate(data)) {
                System.out.println(errorMsg);
                data = null;
            } else {
                break;
            }
        }

        return data;
    }
}
