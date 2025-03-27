package lang.obj;

//부모가 없으면 암묵적으로 Obj 클래스를 상속받는다.
public class Parent extends Object {
    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
