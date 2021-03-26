package sunmin.basic.day09;

public class StarCraft2 {
    public static void main(String[] args) {
        SCV s = new SCV();
        s.attack();
        s.move();
        s.specialAbility();

        Marine m = new Marine();
        m.attack();
        m.move();
        m.specialAbility();

        Firebat f = new Firebat();
        f.attack();
        f.move();
        f.specialAbility();
    }
}

abstract class Unit2 {
    protected String name;
    protected int hp;
    protected int power;
    protected double mvspd;
    protected int mineral;
    protected int gas;

    public Unit2() { }
}

interface Function {
    void attack();
    void move();
    void specialAbility();
}

class SCV2 extends Unit2 implements Function {

    final String fmtattck = "융합절단기를 이용해서 대상에 %d의 피해를 주고 있습니다 \n";
    final String fmtmove = "지정한 위치로 %.2f의 속도로 이동중입니다 \n";
    final String fmtspabty = "대상을 수리하는 중입니다 \n";

    public SCV2() {
        name = "건설로봇";
        hp = 45;
        power = 5;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void attack() {
        // System.out.println("융합절단기를 이용해서 대상에" + power +"의 피해를 주고 있습니다");
        // 추상메서드를 이용해서 부모클래스에 정의된 attack 메서드를 유닛에 맞게 재정의함
        System.out.printf(fmtattck, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);
    }
}

class Marine2 extends Unit2 implements Function{

    final String fmtattck = "가우스소총을 이용해서 대상에 %d의 피해를 주고 있습니다 \n";
    final String fmtmove = "지정한 위치로 %.2f의 속도로 이동중입니다 \n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도 50%% 증가, 공격속도 33%% 증가합니다 \n";

    public Marine2() {
        name = "해병";
        hp = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattck, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);
    }
}

class Firebat2 extends Unit2 implements Function{

    final String fmtattck = "화염방사기를 이용해서 대상에 %d의 피해를 주고 있습니다 \n";
    final String fmtmove = "지정한 위치로 %.2f의 속도로 이동중입니다 \n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도 50%% 증가, 공격속도 33%% 증가합니다 \n";

    public Firebat2() {
        name = "화염방사병";
        hp = 50;
        power = 8 * 2;
        mvspd = 1.875;
        mineral = 50;
        gas = 25;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattck, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.printf(fmtspabty);
    }
}