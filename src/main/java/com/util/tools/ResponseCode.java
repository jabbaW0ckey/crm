package com.util.tools;
/**
 * ��Ӧ״̬��ö����
 * @author Jie
 *
 */
public enum ResponseCode {
	SUCCESS(0, "SUCCSS"), 
	ERROR(1, "ERROR"), 
	NEED_LOGIN(10, "NEED_LOGIN"),//��Ҫ��¼
	ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");//��Ҫ������������

	private final int code;
	private final String desc;
	
	
	private ResponseCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
