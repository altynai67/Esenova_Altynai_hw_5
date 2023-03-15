public class Main {
    public static void main(String[] args) {
        Boss MyBoss = new Boss();
        MyBoss.setDamage(80);
        System.out.println(MyBoss.getDamage());
        MyBoss.setHealth(700);
        System.out.println(MyBoss.getHealth());
        MyBoss.setBossDefenceType("Physics");
        System.out.println(MyBoss.getBossDefenceType());
        Hero Hero1 = new Hero(250, 60, 120);
        Hero Hero2 = new Hero(260, 65,0);
        Hero Hero3 = new Hero(240,55);


        }
    }