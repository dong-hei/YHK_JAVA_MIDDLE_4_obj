package lang.obj.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("멍무이", 5);
        Dog dog2 = new Dog("멍무이2", 2);

        System.out.println("1. 단순 toString 출력");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. 단순 println 내부에서 toString 출력");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2); 
        
        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        //dog1의 참조값 직접 출력
        String refVal = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("dog 1 refVal = " + refVal);

        //dog1의 참조값 직접 출력
        String refVal2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("dog 2 refVal = " + refVal2);
        
    }
}
