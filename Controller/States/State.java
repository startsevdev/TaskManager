package Controller.States;

import View.ConsoleView;

public abstract class State {

    ConsoleView view = new ConsoleView();

    public abstract void inputNumber(Integer number);
    public abstract void inputText(String text);
    public abstract void inputC();
    public abstract void inputR();
    public abstract void inputB();
    public abstract void inputT();
    public abstract void inputD();
    public abstract void show();

}