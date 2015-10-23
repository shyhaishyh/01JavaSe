package cn.wd.jiekou;

public class UsbTest {

	public static void main(String[] args) {
		
		Usb usb = new UsbImpl();
		UsbImpl usbI = new UsbImpl();
		
		usb.service();
		usbI.service(usb);


	}
}
