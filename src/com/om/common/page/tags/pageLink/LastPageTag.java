package com.om.common.page.tags.pageLink;

import com.om.common.page.tags.base.ForwardPageTagBase;

/**
 * 尾页
  * @ClassName: LastPageTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:23:42 PM
 */
public class LastPageTag extends ForwardPageTagBase{

	@Override
	protected String getPageUrl() {
		if(this.page.getCurrentPage() == this.page.getLastPage()){
			return null;
		}
		return this.page.getLastPageUrl();
	}

}
