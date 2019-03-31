/**
 * @Auther: user
 * @Date: 2019/3/31 16:22
 * @Description:
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says ....");
        turkey.gobble();
        turkey.fly();

        testDuck(duck);

        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
