package lang.obj.equals;

/**
 * 동일성 - 컴퓨터가 보기에 같은 참조값인가?
 * 동등성 - 사람이 보기에 같은 값인가?
 */
public class EqualMainV1 {
    public static void main(String[] args) {
        UserV1 u1 = new UserV1("id-100");
        UserV1 u2 = new UserV1("id-100");

        //동일성을 비교하니까 false
        System.out.println("identity = " + (u1 == u2));

        //equals의 디폴트는 동일성을 비교해서 false 
        System.out.println("equals = " + (u1.equals(u2)));
    }
}
