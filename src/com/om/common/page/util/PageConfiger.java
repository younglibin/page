package com.om.common.page.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 从配置文件读取分页标签的参数
  * @ClassName: PageConfiger  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 6, 2012 1:52:32 PM
 */
public class PageConfiger
{
  public static final int DEFAULT_PAGE_LIST_NUM = 0;
  private static PageConfiger instance = null;
  private static String CONFIG_FILENAME = "/page/page.properties";
  private static String EXCEPT_PARAMETERS = "page.config.exceptParameters";
  public static String PAGE_LIST_NUM = "page.config.pageListNum";
  public static final String PAGE_MIN = "page.config.min";
  public static final String PAGE_MAX = "page.config.max";
  private Properties props = new Properties();
  private List<String> exceptParameterList = new ArrayList();
  private int pageListNum = 0;

  private PageConfiger()
  {
    try
    {
      this.props.load(super.getClass().getResourceAsStream(CONFIG_FILENAME));
    }
    catch (Exception e)
    {
      System.err.println("在CLASSPATH根目录下没找到文件" + CONFIG_FILENAME + "!");
    }
    String exceptParameter = this.props.getProperty(EXCEPT_PARAMETERS);
    if ((exceptParameter != null) && (exceptParameter.trim().length() > 0))
    {
      String[] tmps = exceptParameter.split(",");
      String[] arr$ = tmps; int len$ = arr$.length; for (int i$ = 0; i$ < len$; ++i$) { String tmp = arr$[i$];

        if (tmp.trim().length() > 0)
        {
          this.exceptParameterList.add(tmp.trim());
        }
      }
    }
    String tmpPageListNum = this.props.getProperty(PAGE_LIST_NUM);
    if ((tmpPageListNum != null) && (tmpPageListNum.trim().length() > 0))
    {
      try
      {
        this.pageListNum = Integer.valueOf(tmpPageListNum.trim()).intValue();
      }
      catch (Exception e)
      {
        System.err.println("在page.properties中page.config.pageListNum不是数字!");
      }
    }
  }

  public static PageConfiger getInstance()
  {
    if (instance == null)
      instance = new PageConfiger();
    return instance;
  }

  public String getProperty(String key)
  {
    return this.props.getProperty(key);
  }

  public List getExceptParameterList() {
    return this.exceptParameterList;
  }

  public int getPageListNum()
  {
    return this.pageListNum;
  }
}