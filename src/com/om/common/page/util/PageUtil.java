package com.om.common.page.util;


import java.util.List;
import javax.servlet.http.HttpServletRequest;


/**
 * 分页标签工具类
  * @ClassName: PageUtil  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 1:54:23 PM
 */
public class PageUtil
{
  HttpServletRequest request;
  Page page = null;
  private String url;
  private String parameter;
  private String uri;
  private String previousPageUrl;
  private String nextPageUrl;
  private String firstPageUrl;
  private String lastPageUrl;

  public static boolean isExceptParameter(String para)
  {
    List exceptParameterList = PageConfiger.getInstance().getExceptParameterList();
    return ((exceptParameterList != null) && (exceptParameterList.size() > 0) && (exceptParameterList.contains(para)));
  }

  public PageUtil(HttpServletRequest request)
  {
    this.request = request;
    parseUri();
  }

  public HttpServletRequest getRequest()
  {
    return this.request;
  }

  public void setRequest(HttpServletRequest request)
  {
    this.request = request;
  }

  public String getParameter()
  {
    return this.parameter;
  }

  public void setParameter(String parameter)
  {
    this.parameter = parameter;
  }

  public String getUri()
  {
    return this.uri;
  }

  public void setUri(String uri)
  {
    this.uri = uri;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setUrl(String url)
  {
    this.url = url;
  }

  public String getFirstPageUrl()
  {
    return this.firstPageUrl;
  }

  public void setFirstPageUrl(String fpUrl)
  {
    this.firstPageUrl = fpUrl;
  }

  public String getLastPageUrl()
  {
    return this.lastPageUrl;
  }

  public void setLastPageUrl(String lpUrl)
  {
    this.lastPageUrl = lpUrl;
  }

  public String getNextPageUrl()
  {
    return this.nextPageUrl;
  }

  public void setNextPageUrl(String npUrl)
  {
    this.nextPageUrl = npUrl;
  }

  public String getPreviousPageUrl()
  {
    return this.previousPageUrl;
  }

  public void setPreviousPageUrl(String ppUrl)
  {
    this.previousPageUrl = ppUrl;
  }

  public Page getPage()
  {
    return this.page;
  }

  public void parseUri()
  {
    this.page = ((Page)this.request.getAttribute("_PAGEOBJECT"));
    if (this.page == null)
      this.page = new PageImpl();
    this.previousPageUrl = this.page.getPreviousPageUrl();
    this.nextPageUrl = this.page.getNextPageUrl();
    this.firstPageUrl = this.page.getFirstPageUrl();
    this.lastPageUrl = this.page.getLastPageUrl();
  }
}