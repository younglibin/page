package com.om.common.page.tags.pageLink;

import com.om.common.page.tags.base.ForwardPageTagBase;

/**
 *  下一页
  * @ClassName: NextPageTag  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 2:23:57 PM
 */
public class NextPageTag  extends ForwardPageTagBase {

	@Override
	protected String getPageUrl() {
		if(this.page.getCurrentPage() == this.page.getNextPage()){
			return null;
		}
		return this.page.getNextPageUrl();
	}
	
}
