package com.om.common.page.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

/**
 * 分页标签绑定
  * @ClassName: PageHelper  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 3:30:16 PM
 */
public class PageHelper {
	public static Page getPage(HttpServletRequest request, int listCount,
			int pageNo, int pageListNum) {
		PageImpl page = new PageImpl();
		page.setListCount(listCount);
		page.setCurrentPage(pageNo);
		if (pageListNum <= 0) {
			pageListNum = PageConfiger.getInstance().getPageListNum();
		}
		page.setPageListNum(pageListNum);
		page.account();
		page.setRequestURI(request.getRequestURI());
		request.setAttribute("_PAGEOBJECT", page);
		parseUri(request, page);
		return page;
	}

	public static Page getPage(HttpServletRequest request, int listCount,
			int pageListNum) {
		String sPageNo = request.getParameter("_pageNo");
		Integer oPageNo = null;
		if ((sPageNo != null) && (!(sPageNo.equals("")))) {
			try {
				oPageNo = Integer.valueOf(sPageNo);
			} catch (NumberFormatException e) {
				oPageNo = null;
			}
		}
		if (oPageNo != null)
			return getPage(request, listCount, oPageNo.intValue(), pageListNum);
		return getPage(request, listCount, 0, pageListNum);
	}

	private static void parseUri(HttpServletRequest request, Page page) {
		page = (Page) request.getAttribute("_PAGEOBJECT");
		String uri = page.getRequestURI();
		StringBuffer paraStr = new StringBuffer();
		Map paras = request.getParameterMap();
		Set set = paras.keySet();
		for (Iterator i$ = set.iterator(); i$.hasNext();) {
			Object obj = i$.next();

			String para = (String) obj;
			if ((para != null) && (!(para.equals("_pageNo")))
					&& (!(PageUtil.isExceptParameter(para)))) {
				paraStr.append(para);
				paraStr.append("=");
				paraStr.append(request.getParameter(para));
				paraStr.append("&");
			}
		}
		page.setPreviousPageUrl(uri + "?" + paraStr.toString() + "_pageNo"
				+ "=" + page.getPreviousPage());

		page.setNextPageUrl(uri + "?" + paraStr.toString() + "_pageNo" + "="
				+ page.getNextPage());
		page.setFirstPageUrl(uri + "?" + paraStr.toString() + "_pageNo" + "="
				+ page.getFirstPage());

		page.setLastPageUrl(uri + "?" + paraStr.toString() + "_pageNo" + "="
				+ page.getLastPage());

		page.setPageUrlWithoutPageNo(uri + "?" + paraStr.toString());
	}

	protected static String getUrl(HttpServletRequest request) {
		StringBuffer paraStr = new StringBuffer();
		Map paras = request.getParameterMap();

		Set set = paras.keySet();
		for (Iterator i$ = set.iterator(); i$.hasNext();) {
			Object obj = i$.next();

			String para = (String) obj;
			if ((para != null) && (!(para.equals("_pageNo")))
					&& (!(PageUtil.isExceptParameter(para)))) {
				paraStr.append(para);
				paraStr.append("=");
				paraStr.append(request.getParameter(para));
				paraStr.append("&");
			}
		}
		return request.getRequestURI() + "?" + paraStr.toString();
	}
}