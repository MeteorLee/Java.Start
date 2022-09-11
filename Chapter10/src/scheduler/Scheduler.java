package scheduler;

public interface Scheduler {

	void getNextCall();
	void sendCallToAgent();
}


//인터페이스와 다형성
//
//인터페이스는 "Client Code"와 서비스를 제공하는 "객체" 사이의 약속이다.
//어떤 객체가 어떤 interface타입이라 함은 그 interface가 제공하는 메서드를 구현했따는 의미임
//Client는 어떻게 구현되었는지 상관없이 interface의 정의만을 보고 사용할 수 있음(ex:JDBC)
//다앙햔 구현이 필요한 인터페이스를 설계하는 일은 매우 중요함