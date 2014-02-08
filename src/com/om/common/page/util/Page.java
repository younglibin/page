package com.om.common.page.util;


/**
 * 定义分页使用的接口方法
  * @ClassName: Page  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 10:30:05 AM
 */
public abstract interface Page
{
  public static final String PAGE_NO_PARAMETER_STRING = "_pageNo";
  public static final String PAGE_NAME_IN_REQUEST_ATTRIBUTE = "_PAGEOBJECT";

  public abstract void account();


  public abstract int getCurrentPage();

  public abstract void setCurrentPage(int paramInt);

  public abstract int getListCount();

  public abstract void setListCount(int paramInt);

  public abstract int getPageCount();

  public abstract void setPageCount(int paramInt);

  public abstract int getPageListNum();

  public abstract void setPageListNum(int paramInt);

  public abstract int getCurrentPageListNum();

  public abstract void setCurrentPageListNum(int paramInt);

  public abstract int getFirstPage();

  public abstract void setFirstPage(int paramInt);

  public abstract int getLastPage();

  public abstract void setLastPage(int paramInt);

  public abstract int getNextPage();

  public abstract void setNextPage(int paramInt);

  public abstract int getPreviousPage();

  public abstract void setPreviousPage(int paramInt);

  public abstract int getFirstResult();

  public abstract void setFirstResult(int paramInt);

  public abstract String getRequestURI();

  public abstract void setRequestURI(String paramString);

  public abstract String getFirstPageUrl();

  public abstract void setFirstPageUrl(String paramString);

  public abstract String getLastPageUrl();

  public abstract void setLastPageUrl(String paramString);

  public abstract String getNextPageUrl();

  public abstract void setNextPageUrl(String paramString);

  public abstract String getPreviousPageUrl();

  public abstract void setPreviousPageUrl(String paramString);

  public abstract String getPageUrlWithoutPageNo();

  public abstract void setPageUrlWithoutPageNo(String paramString);
}