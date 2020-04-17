package cn.com.util;

public final class StringUtil {
	private StringUtil(){
		
	}
	/*判断相应的String是否为空**/
	public	static  boolean isNullOrEmpty(String str){
		boolean bool = false;
		if(str==null||str.equals("")){
			bool = true;
		}
		return bool;
			
	}

}
