package cn.com.util;

public final class StringUtil {
	private StringUtil(){
		
	}
	/*�ж���Ӧ��String�Ƿ�Ϊ��**/
	public	static  boolean isNullOrEmpty(String str){
		boolean bool = false;
		if(str==null||str.equals("")){
			bool = true;
		}
		return bool;
			
	}

}
