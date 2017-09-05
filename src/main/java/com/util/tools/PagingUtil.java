package com.util.tools;

import java.util.List;

/**
 * ��ҳ������
 * 
 * @author Jie
 *
 */
public class PagingUtil {
	private Integer currentPage;// ��ǰҳ
	private Integer pageSize;// ҳ����ʾ����
	private Integer allCount;// �ܼ�¼��
	// ���ҳ��
	@SuppressWarnings("unused")
	private Integer maxPage;// ���ҳ��
	private List<Object> data;// ��װ����

	public PagingUtil() {
	}

	public PagingUtil(Integer currentPage, Integer pageSize, Integer allCount, Integer maxPage, List<Object> data) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.allCount = allCount;
		this.maxPage = maxPage;
		this.data = data;
	}

	public Integer getMaxPage() {
		return maxPage = (this.allCount % this.pageSize == 0) ? (this.allCount / this.pageSize)
				: (this.allCount / this.pageSize + 1);
	}

	public void setMaxPage(Integer maxPage) {
		this.maxPage = maxPage;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getAllCount() {
		return allCount;
	}

	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}

}
