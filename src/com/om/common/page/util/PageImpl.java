package com.om.common.page.util;

public class PageImpl implements Page {
	private int listCount;
	private int pageListNum;
	private int pageCount;
	private int currentPage;
	private int currentPageListNum;
	private int firstPage;
	private int previousPage;
	private int nextPage;
	private int lastPage;
	private int firstResult;
	private String requestURI;
	private String previousPageUrl;
	private String nextPageUrl;
	private String firstPageUrl;
	private String lastPageUrl;
	private String pageUrlWithoutPageNo;

	public PageImpl() {
		this.listCount = 0;

		this.pageListNum = 10;

		this.pageCount = 0;

		this.currentPage = 0;

		this.currentPageListNum = 0;

		this.firstPage = 0;

		this.previousPage = 0;

		this.nextPage = 0;

		this.lastPage = 0;

		this.firstResult = 0;

		this.requestURI = null;
	}

	public int getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getListCount() {
		return this.listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
	}

	public int getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageListNum() {
		return this.pageListNum;
	}

	public void setPageListNum(int pageListNum) {
		this.pageListNum = pageListNum;
	}

	public int getCurrentPageListNum() {
		return this.currentPageListNum;
	}

	public void setCurrentPageListNum(int currentPageListNum) {
		this.currentPageListNum = currentPageListNum;
	}

	public int getFirstPage() {
		return this.firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return this.lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getPreviousPage() {
		return this.previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public int getFirstResult() {
		return this.firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public String getRequestURI() {
		return this.requestURI;
	}

	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}

	public String getFirstPageUrl() {
		return this.firstPageUrl;
	}

	public void setFirstPageUrl(String firstPageUrl) {
		this.firstPageUrl = firstPageUrl;
	}

	public String getLastPageUrl() {
		return this.lastPageUrl;
	}

	public void setLastPageUrl(String lastPageUrl) {
		this.lastPageUrl = lastPageUrl;
	}

	public String getNextPageUrl() {
		return this.nextPageUrl;
	}

	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}

	public String getPreviousPageUrl() {
		return this.previousPageUrl;
	}

	public void setPreviousPageUrl(String previousPageUrl) {
		this.previousPageUrl = previousPageUrl;
	}

	public String getPageUrlWithoutPageNo() {
		return this.pageUrlWithoutPageNo;
	}

	public void setPageUrlWithoutPageNo(String pageUrlWithoutPageNo) {
		this.pageUrlWithoutPageNo = pageUrlWithoutPageNo;
	}

	public void account() {
		if (this.pageListNum <= 0) {
			this.pageListNum = 20;
		}
		int t0PageCount = this.listCount / this.pageListNum;
		int tPageCount = t0PageCount;
		int tCountLost = this.listCount % this.pageListNum;
		if (tPageCount == 0) {
			tPageCount = 1;
		}
		if ((tCountLost > 0) && (t0PageCount > 0)){
			this.pageCount = (++tPageCount);
		}else{
			this.pageCount = tPageCount;
		}
		if (this.currentPage < 1){
			this.currentPage = 1;
		}
		if (this.currentPage > this.pageCount){
			this.currentPage = this.pageCount;
		}
		if ((this.currentPage == tPageCount) && (tCountLost > 0)) {
			this.currentPageListNum = tCountLost;
		} else {
			this.currentPageListNum = this.pageListNum;
		}
		this.firstResult = ((this.currentPage - 1) * this.pageListNum + 1);
		this.firstPage = 1;
		this.lastPage = this.pageCount;
		this.previousPage = (this.currentPage - 1);
		this.nextPage = (this.currentPage + 1);
		if (this.previousPage < this.firstPage)
			this.previousPage = this.firstPage;
		if (this.nextPage > this.lastPage)
			this.nextPage = this.lastPage;
	}
}