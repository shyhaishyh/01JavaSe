package cn.wd.jiekou;

public class UsbImpl implements Usb {

	@Override
	public void service() {
		System.out.println("ʵ�ֽӿڡ�");
	}
	
	public void service(Usb usb){
		System.out.println("���Σ�ʵ�ֽӿڡ�");
	}
}
