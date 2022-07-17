public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;

	public Duck(){
	}

	public abstract void display();

	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}

	public void swim(){
		System.out.println("모든 오리는 헤엄을 쳐요~");
	}

	// 동적으로 행동을 지정하는 방법 (더 스말~트 하게 하는 방법)
	// 오리의 행동을 즉석으로 변경하고 싶다면 이 메소드를 호출하면됨
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
}
