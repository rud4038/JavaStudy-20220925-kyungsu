package j10_인터페이스.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Desctop desctop = new Desctop();
		
		desctop.powerOn();
		desctop.connect("빔프로젝트");
		desctop.disConnect("빔프로젝트");
		desctop.powerOff();

	}

}
