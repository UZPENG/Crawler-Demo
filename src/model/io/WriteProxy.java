package model.io;

import java.io.File;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * @author serverliu on 2017/12/24.
 */
public class WriteProxy {

    public static String rootDir = "E://spider/";
    public static final int FLAG_OFFER_DETAIL = 0;
    public static final int FLAG_RENAME = 1;
    public static final int FLAG_UPDATE = 2;
    public static final int FLAG_ZUANSHI = 3;
    public static final int FLAG_JUHUASUAN = 4;
    public static final int FLAG_TAOBAOKE = 5;
    public static final int FLAG_SHOP_DETAIL = 6;
    public static final int FLAG_UNSALE = 7;

    public static <T> void writeToExcel(File file, String[] titles, List<T> entities, int flag){
        WriteInvocationHandler outputInvocationHandler = new WriteInvocationHandler();
        outputInvocationHandler.setWriteIntoExcelProxy(new WriteIntoExcelManager());
        IWriteIntoExcel proxy = (IWriteIntoExcel) Proxy.newProxyInstance(WriteIntoExcelManager.class.getClassLoader(), new Class[]{IWriteIntoExcel.class}, outputInvocationHandler);
        proxy.writeIntoExcel(file, titles, entities, flag);
    }
}
