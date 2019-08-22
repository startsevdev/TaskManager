import Controller.Input;
import Model.TaskStorage;
import Model.User;

public class Main {

    public static void main(String[] args) {

        TaskStorage storage = new TaskStorage();

        storage.createTask("Do Something");
        storage.createTask("Task 2", "Description 2");
        storage.createTask("Task 3", "Description 3");

        User user = new User(storage);

        Input input;

        do {
            user.getState().show();
            input = new Input();

            if (input.getString().equals("c")) {
                user.getState().inputC();
            }
            else if (input.getString().equals("r")) {
                user.getState().inputR();
            }
            else if (input.getString().equals("b")) {
                user.getState().inputB();
            }
            else if (input.getString().equals("t")) {
                user.getState().inputT();
            }
            else if (input.getString().equals("d")) {
                user.getState().inputD();
            }
            else if (input.isInteger()) {
                user.getState().inputNumber(Integer.parseInt(input.getString()));
            }
            else {
                user.getState().inputText(input.getString());
            }

        } while (! input.getString().equals("0"));

    }

}
