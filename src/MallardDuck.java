/**
 * @Auther: user
 * @Date: 2019/3/31 16:15
 * @Description:
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
