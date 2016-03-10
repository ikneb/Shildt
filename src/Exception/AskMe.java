package Exception;

import java.util.Random;

/**
 * Created by Benki on 10.03.2016.
 */
enum Ansver {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();

    Ansver ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15) return Ansver.MAYBE;//15%
        else if (prob < 30) return Ansver.NO;//15%
        else if (prob < 60) return Ansver.YES;//30%
        else if (prob < 75) return Ansver.LATER;//15%
        else if (prob < 98) return Ansver.SOON;//13%
        else return Ansver.NEVER; //2%
    }
}

public class AskMe {
    static void answer(Ansver result) {
        switch (result) {
            case NO:
                System.out.println(" нет ");
                break;
            case YES:
                System.out.println(" да ");
                break;

            case MAYBE:
                System.out.println(" может быть ");
                break;

            case SOON:
                System.out.println(" скоро ");
                break;

            case NEVER:
                System.out.println(" никогда ");
                break;


        }
    }

    public static void main(String[] args) {
        Question question = new Question();

        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());

    }

}
