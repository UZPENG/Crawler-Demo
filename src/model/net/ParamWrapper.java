package model.net;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

/**
 * @author serverliu on 2017/12/26.
 */
public class ParamWrapper {
    private static String Id;
    private static String startDate;

    public static String getStartDate() {
        return startDate;
    }

    public static String getEndDate() {
        return endDate;
    }

    private static String endDate;
    private static ParamWrapper paramWrapper = new ParamWrapper();

    private ParamWrapper(){
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now().minusDays(1), LocalTime.of(0,0,0));
        endDate = String.valueOf(localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
        startDate = String.valueOf(localDateTime.minusDays(29).toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
    }

    public void setId(String id) {
        Id = id;
    }

    static class ParamBuilder{
        String paraStr = "";

        public ParamBuilder addParam(String key, String value){
            paraStr += "&"+key+"="+value;
            return this;
        }

        public ParamBuilder addId(){
            addParam(Key.id, Id);
            return this;
        }

        public ParamBuilder addShopId(){
            addParam(Key.shopId, Id);
            return this;
        }

        public ParamBuilder addDate(){
            addParam(Key.startDate, startDate);
            addParam(Key.endDate, endDate);
            return this;
        }

        public String build(){
            return paraStr;
        }
    }

    public static ParamWrapper newInstance(){
        if(paramWrapper != null){
            return paramWrapper;
        }else {
            paramWrapper = new ParamWrapper();
            return paramWrapper;
        }
    }

}
