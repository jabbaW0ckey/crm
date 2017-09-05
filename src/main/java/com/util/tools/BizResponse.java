package com.util.tools;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * ҵ���߸������ݷ�װ��
 * 
 * @author Jie ��֤json���л�ʱ�����value��null�Ķ���keyҲ����ʧ
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class BizResponse<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;
	private String message;
	private T data;

	/**
	 * ������1
	 * 
	 * @param status
	 */
	private BizResponse(int status) {
		this.status = status;
	}

	/**
	 * ������2
	 * 
	 * @param status
	 * @param data
	 */
	private BizResponse(int status, T data) {
		this.status = status;
		this.data = data;
	}

	/**
	 * ������3
	 * 
	 * @param status
	 * @param message
	 * @param data
	 */
	public BizResponse(int status, String message, T data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	/**
	 * ������4
	 * 
	 * @param status
	 * @param message
	 */
	private BizResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	/**
	 * �Ƿ�ɹ� �������������л�ʱ����ʾ��json�ṹ������
	 * 
	 * @return
	 */
	@JsonIgnore
	public boolean isSuccess() {
		return this.status == ResponseCode.SUCCESS.getCode();
	}

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public T getData() {
		return data;
	}

	/**
	 * �����ṩ������1����ʾ�ɹ�״̬ int status
	 * 
	 * @return
	 */
	public static <T> BizResponse<T> createBySuccess() {
		return new BizResponse<T>(ResponseCode.SUCCESS.getCode());
	}

	/**
	 * �����ṩ������4����ʾ�ɹ����������ɹ�����ϢString message
	 * 
	 * @param message
	 * @return
	 */
	public static <T> BizResponse<T> createBySuccessMessage(String message) {
		return new BizResponse<T>(ResponseCode.SUCCESS.getCode(), message);
	}

	/**
	 * �����ṩ������2����ʾ�ɹ��������ݷ�װ
	 * 
	 * @param data
	 * @return
	 */
	public static <T> BizResponse<T> createBySuccessData(T data) {
		return new BizResponse<T>(ResponseCode.SUCCESS.getCode(), data);
	}

	/**
	 * �����ṩ������3����ʾ�ɹ���Ϣ�����ҷ�װ����
	 * 
	 * @param message
	 * @param data
	 * @return
	 */
	public static <T> BizResponse<T> createBySuccessMessageAndData(String message, T data) {
		return new BizResponse<T>(ResponseCode.SUCCESS.getCode(), message, data);
	}

	/**
	 * ����ͨ�õĴ�������
	 * 
	 * @return
	 */
	public static <T> BizResponse<T> createByError() {
		return new BizResponse<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
	}

	/**
	 * ������4���ش�����Ϣ
	 * 
	 * @param errorMessage
	 * @return
	 */
	public static <T> BizResponse<T> createByErrorMessage(String errorMessage) {
		return new BizResponse<T>(ResponseCode.ERROR.getCode(), errorMessage);
	}

	/**
	 * code�����ķ����Ա���Ĵ�����ʾ����ʾ��������
	 * 
	 * @param errorCode
	 * @param errorMessage
	 * @return
	 */
	public static <T> BizResponse<T> createByErrorCodeMessage(int errorCode, String errorMessage) {
		return new BizResponse<T>(errorCode, errorMessage);
	}

}
