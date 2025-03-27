package lang.obj.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 u1 = new UserV2("id-100");
        UserV2 u2 = new UserV2("id-100");

        //동일성 비교 라서 false
        System.out.println("identity = " + (u1 == u2));

        //동등성 비교 라서 true
        System.out.println("equality = " + u1.equals(u2));
    }
}
