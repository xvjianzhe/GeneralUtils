package xyz.sourcespace.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by xvjianzhe on 2017/1/21.
 */
public class DateFormater {
    /**
     * 根据指定模板生成对应格式的日期.
     *
     * @param millisecond 毫秒数
     * @param parttern    模板
     * @return 格式化后的内容
     */
    public static String formatDate(Long millisecond, String parttern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(parttern, Locale.getDefault());
        return simpleDateFormat.format(new Date(millisecond));
    }
}
