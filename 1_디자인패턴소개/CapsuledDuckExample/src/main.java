public class main {
	public static void main(String[] args){
		Duck insoo = new InsooDuck();
		insoo.display();
		insoo.performQuack();
		insoo.performFly();
		insoo.swim();

		System.out.println("----------------------------");

		// 동적할당 테스트 코드
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered()); // Duck의 setter method 호출
		model.performFly();
	}
}
