package ZZPatternsExample;

public class StrategyLesson {
    public static void main(String[] args) {
        DoBehavior doBehavior = new DoBehavior();

        doBehavior.setBehavior(new Sleeping());
        System.out.println(doBehavior.doNow());

        doBehavior.setBehavior(new Reading());
        System.out.println(doBehavior.doNow());

        doBehavior.setBehavior(new Writing());
        System.out.println(doBehavior.doNow());

        doBehavior.setBehavior(new Sleeping());
        System.out.println(doBehavior.doNow());

    }
}

interface Behavior {
    public String doIt();
}

class Reading implements Behavior {

    @Override
    public String doIt() {
        return "I am reading";
    }
}

class Writing implements Behavior {

    @Override
    public String doIt() {
        return "I am writing";
    }
}

class Sleeping implements Behavior {

    @Override
    public String doIt() {
        return "I am sleeping";
    }
}

class DoBehavior {
    Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public String doNow() {
        return behavior.doIt();
    }
}
