package com.om.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 可用Properties文件配置的Contants基类 <p/> 子类可如下编写
 * 
 * <pre>
 *     public class Constants extends ConfigurableContants {
 *      static {
 *        init(&quot;system.properties&quot;);
 *     }
 * </pre>
 * 
 * @author gan.qiang
 * @version1.0
 * 
 */
public class ConfigurableConstants {

	private static final Logger _logger = Logger
			.getLogger(ConfigurableConstants.class);

	protected static Properties p = new Properties();

	protected static void init(String propertyFileName) {
		InputStream in = null;
		try {
			in = ConfigurableConstants.class
					.getResourceAsStream(propertyFileName);
			if (in != null)
				p.load(in);
		} catch (IOException e) {
			_logger.error("load " + propertyFileName + " into Contants error");
		} finally {
			IOUtil.close(in, _logger, "载入系统配置文件时出错，文件路径：" + propertyFileName);
		}
	}

	protected static String getInitProperty(String key, String defaultValue) {
		return p.getProperty(key, defaultValue);
	}

}
