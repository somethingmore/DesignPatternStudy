public class InsooDuck extends Duck{
	InsooDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public void display(){
		System.out.println("저는 인수 오리예용");
	}
}
