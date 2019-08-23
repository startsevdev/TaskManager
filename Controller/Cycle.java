package Controller;

import Model.TaskStorage;
import Model.User;

public class Cycle {

    private User user;
    private Input input;

    public Cycle() {
        this(new TaskStorage());
    }

    public Cycle(TaskStorage storage) {
        user = new User(storage);
    }

    public void run() {

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

        } while (! input.getString().equals("q"));
    }

}
