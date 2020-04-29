import cn.hutool.json.JSONUtil;

import java.time.ZonedDateTime;

/**
 * @Author Xia ShengSheng
 * @Date 2020/4/28 14:07
 * @Version 1.0
 */
public class GetTime {
    public static void main(String[] args) {
        //获取当前时间
        ZonedDateTime time=ZonedDateTime.now();
        System.out.println(time);//2020-04-28T14:09:49.217+08:00[Asia/Shanghai]
    }
}