package utils;

public class Constants {
	//IE驱动文件
	public static final String IE_DRIVER=System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe";
	//Chrome驱动文件
	public static final String CHROME_DRIVER=System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
	//默认等待超时时间
	public static final long WAIT_TIME = 30;
	//显式等待默认等待超时时间
	public static final int EXPLICIT_WAIT = 30;
	//默认下载文件的路径
	public static final String DOWNLOAD_PATH=System.getProperty("user.dir")+"\\download";
	//截图文件路径
	public static final String SCREENSHOT = System.getProperty("user.dir")+"\\screenshots";
	//测试数据路径
	public static final String DATA_PATH = System.getProperty("user.dir")+"\\data";
	//ECSHOP高级搜索的网址
	public static final String ECSHOP_ADVANCED_SEARCH_URL = "http://localhost/ws/ecshop/upload/search.php?encode=YToyOntzOjM6ImFjdCI7czoxNToiYWR2YW5jZWRfc2VhcmNoIjtzOjE4OiJzZWFyY2hfZW5jb2RlX3RpbWUiO2k6MTUyMjc0OTc5Nzt9";

}
