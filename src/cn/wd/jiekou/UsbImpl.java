package cn.wd.jiekou;

public class UsbImpl implements Usb {

	@Override
	public void service() {
		System.out.println("ʵ�ֽ�ڡ�");
	}
	
	public void service(Usb usb){
		System.out.println("���Σ�ʵ�ֽ�ڡ�");
	}
}
