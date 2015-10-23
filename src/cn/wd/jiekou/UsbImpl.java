package cn.wd.jiekou;

public class UsbImpl implements Usb {

	@Override
	public void service() {
		System.out.println("实现借口。");
	}
	
	public void service(Usb usb){
		System.out.println("带参，实现借口。");
	}
}
