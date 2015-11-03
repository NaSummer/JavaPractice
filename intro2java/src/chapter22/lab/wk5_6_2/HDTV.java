package chapter22.lab.wk5_6_2;

/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: 2015年10月16日 上午10:00:44 
 * @version 1.0 
 * @param 
 */

public class HDTV {

	private int size;
	private String brand;
	
	public HDTV() {
		size = 0;
		brand = new String();
	}
	
	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
