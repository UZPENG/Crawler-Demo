package model.io;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author serverliu on 2017/12/24.
 */
public class WriteInvocationHandler implements InvocationHandler {
    private WriteIntoExcelManager writeIntoExcelProxy;
    private List<String> date;

    public void setDate(List<String> date) {
        this.date = date;
    }

    public void setWriteIntoExcelProxy(WriteIntoExcelManager writeIntoExcelProxy) {
        this.writeIntoExcelProxy = writeIntoExcelProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        File file = (File) args[0];
        String[] titles = (String[])args[1];
        List<?> list = (List<?>)args[2];
        int flag = (Integer) args[3];
        try{
            Workbook workbook = new HSSFWorkbook();
            Sheet sheet = workbook.createSheet();

            writeIntoExcelProxy.setSheet(sheet);

            Row row = sheet.createRow(0);
            for (int i = 0; i < titles.length; i++) {
                row.createCell(i).setCellValue(titles[i]);
            }

            switch (flag){
                case WriteProxy.FLAG_OFFER_DETAIL:
                    writeIntoExcelProxy.offerDetailOutput(list);
                    break;

                case WriteProxy.FLAG_SHOP_DETAIL:
                    writeIntoExcelProxy.shopDetailOutput(list);
                    break;

                case WriteProxy.FLAG_RENAME:
                    writeIntoExcelProxy.renameOutput(list);
                    break;

                case WriteProxy.FLAG_UNSALE:
                    writeIntoExcelProxy.unSaleOutput(list);
                    break;

                case WriteProxy.FLAG_UPDATE:
                    writeIntoExcelProxy.itemUpdateOutput(list);
                    break;

                case WriteProxy.FLAG_JUHUASUAN:
                    writeIntoExcelProxy.juHuaSuanOutput(list);
                    break;

                case WriteProxy.FLAG_ZUANSHI:
                    writeIntoExcelProxy.zuanShiOutput(list);
                    break;

                case WriteProxy.FLAG_TAOBAOKE:
                    writeIntoExcelProxy.taobaokeOutput(list);
                    break;
            }

            System.out.println("开始写入文件。。。");
            workbook.write(new FileOutputStream(file));
            System.out.println("写入完成！");
         }catch (Exception e){
            e.printStackTrace();
        }
            return proxy;
        }
}
