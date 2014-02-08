package com.om.common.page.tags.pageLink;

import com.om.common.page.tags.base.ForwardPageTagBase;

/**
 * 首页
  * @ClassName: FirstPageTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:23:30 PM
 */
public class FirstPageTag extends ForwardPageTagBase {
  private static final long serialVersionUID = 1569099539L;

  protected String getPageUrl()  {
    if (this.page.getCurrentPage() == this.page.getFirstPage()){
    	return null;
    }
    return this.pu.getFirstPageUrl();
  }
}
