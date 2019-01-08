package test;

import leancloud.LeanCloud;
import util.WebUtil;

public class Test {
	public static void main(String[] args) {
		String direction = "0";
		String busName = "50";
		String direction0 = WebUtil.sendGet(
				"http://busmishu.com:8080/BusComeServer/pages/index/IndexAction.do?action=mapxxx&bus_direction="
						+ direction + "&bus_name=" + busName);
		direction = "1";
		String direction1 = WebUtil.sendGet(
				"http://busmishu.com:8080/BusComeServer/pages/index/IndexAction.do?action=mapxxx&bus_direction="
						+ direction + "&bus_name=" + busName);
		LeanCloud.save("bus50", busName, direction0, direction1,
				"http://busmishu.com:8080/BusComeServer/pages/index/IndexAction.do?action=mapxxx&bus_direction="
						+ direction + "&bus_name=" + busName);
	}
}
