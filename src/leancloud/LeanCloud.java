package leancloud;

import java.util.Calendar;
import java.util.Date;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

public class LeanCloud {

	static {
		AVOSCloud.initialize("Uwlix6itd8gPfgjpe7xBY0JJ-gzGzoHsz", "S0wVbxSAkst3zHEMAtkxxc04",
				"iUfQ99tiKt3UtFzlzohLuLnE");
	}

	public static void save(String table, String busName, String direction0, String direction1, String requestUrl) {
		AVObject obj = new AVObject(table);
		obj.put("busName", busName);
		obj.put("direction0", direction0);
		obj.put("direction1", direction1);
		obj.put("provider", "aliyunCloudFunction");
		obj.put("requestUrl", requestUrl);
		Calendar calendar = Calendar.getInstance();
		obj.put("timestamp", calendar.getTimeInMillis() + "");
		calendar.add(Calendar.HOUR_OF_DAY, 8);
		obj.put("beijingTime", new Date(calendar.getTimeInMillis()));
		try {
			obj.save();
		} catch (AVException e) {
			e.printStackTrace();
		}
	}

}
