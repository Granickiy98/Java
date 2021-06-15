package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friendOneAction = new ArrayList<>();
        friendOneAction.add(Action.SCISSORS);
        friendOneAction.add(Action.PAPER);
        friendOneAction.add(Action.SCISSORS);

        List<Action> friendTwoAction = new ArrayList<>();
        friendTwoAction.add(Action.PAPER);
        friendTwoAction.add(Action.ROCK);
        friendTwoAction.add(Action.ROCK);

        new BestFriend("Ivan",friendOneAction,exchanger);
        new BestFriend("Vlad",friendTwoAction,exchanger);
    }
}

enum Action{
    ROCK,PAPER,SCISSORS;
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;


    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction,Action friendsAction){
        if((myAction == Action.ROCK && friendsAction == Action.SCISSORS)
        ||(myAction == Action.SCISSORS && friendsAction == Action.PAPER)
        || (myAction == Action.PAPER && friendsAction == Action.ROCK)){
            System.out.println(name + " WINS!!!!");
        }
    }

    public  void  run(){
        Action reply;
        for(Action action : myActions){
            try {
                reply = exchanger.exchange(action);
                whoWins(action,reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

