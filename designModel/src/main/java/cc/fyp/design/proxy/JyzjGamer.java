package cc.fyp.design.proxy;

/**
 * @author von
 * @description:
 * @date 2019-06-0814:37
 */
public class JyzjGamer implements IGamer {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public JyzjGamer(String userName) {
        this.userName = userName;
    }

    @Override
    public void login(String userName) {
        System.out.println(userName + "登录游戏");
    }

    @Override
    public void killBoos() {
        System.out.println("击杀了游戏BOOS");

    }

    @Override
    public void exit() {
        System.out.println("退出了游戏。。。");
    }
}
