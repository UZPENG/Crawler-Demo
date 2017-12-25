package model.io;

import entity.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.text.SimpleDateFormat;
import java.util.List;

import static entity.OfferDetailInfo.*;

/**
 * @author serverliu on 2017/12/24.
 */
class WriteIntoExcelManager {
    private Sheet sheet;

    void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }

     <T> void offerDetailOutput(List<T> entities) {
        int rowIndex = 1;

        for (T info :
                entities) {
            DataBean.ListBean data = (DataBean.ListBean) info;
            Row r = sheet.createRow(rowIndex++);
            int cellIndex = 0;

            r.createCell(cellIndex++).setCellValue(data.getDate());
            r.createCell(cellIndex++).setCellValue(data.getId());
            r.createCell(cellIndex++).setCellValue(data.getTitle());
            r.createCell(cellIndex++).setCellValue(data.getOriPrice() + "/" + data.getPrice());
            r.createCell(cellIndex++).setCellValue(data.getAmount());
            r.createCell(cellIndex++).setCellValue(data.getCatName());
            String adStr = (data.getP4p() == 1 ? "直通车" : "") +
                    (data.getTaoke() == 1 ? "淘宝客" : "") +
                    (data.getSales() == 1 ? "站内活动" : "") +
                    (data.getJuhuasuan() == 1 ? "聚划算" : "") +
                    (data.getZuanzhan() == 1 ? "钻石展位" : "");
            r.createCell(cellIndex).setCellValue(adStr);
        }
    }

    <T> void itemUpdateOutput(List<T> entities){
        int rowIndex = 1;
        SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
        for (T entity : entities) {
            NewItemEntity.DataBean.ListBean info = (NewItemEntity.DataBean.ListBean) entity;
            Row r = sheet.createRow(rowIndex++);
            int cellIndex = 0;

            r.createCell(cellIndex++).setCellValue(format.format(info.getCreateDate()));
            r.createCell(cellIndex).setCellValue(info.getTitle());
        }
    }

    <T> void zuanShiOutput(List<T> entities){
        int rowIndex = 1;
        SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
        for (T entity : entities) {
            ZuanShiEntity.DataBean.ListBean info = (ZuanShiEntity.DataBean.ListBean) entity;
            Row r = sheet.createRow(rowIndex++);
            int cellIndex = 0;

            r.createCell(cellIndex++).setCellValue(info.getPosition());
            r.createCell(cellIndex++).setCellValue(format.format(info.getDate()));
            r.createCell(cellIndex++).setCellValue(info.getPrice());
            r.createCell(cellIndex++).setCellValue(info.getAmount());
            r.createCell(cellIndex++).setCellValue(info.getDisplayRate());
            r.createCell(cellIndex).setCellValue(info.getPositionType());
        }
    }

    <T> void juHuaSuanOutput(List<T> entities){
        int rowIndex = 1;
        SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
        for (T entity :entities) {
            JuHuaSuanEntity.DataBean.ListBean info = (JuHuaSuanEntity.DataBean.ListBean) entity;
            Row r = sheet.createRow(rowIndex++);
            int cellIndex = 0;

            r.createCell(cellIndex++).setCellValue(format.format(info.getDate()));
            r.createCell(cellIndex++).setCellValue(info.getTitle());
            r.createCell(cellIndex++).setCellValue(info.getPrice());
            r.createCell(cellIndex++).setCellValue(info.getAmount());
            r.createCell(cellIndex++).setCellValue(info.getOriPrice());
            r.createCell(cellIndex).setCellValue(info.getRealPrice());
        }
    }

    <T> void unSaleOutput(List<T> entities){
        int rowIndex = 1;
        for (T entity : entities) {
            ItemDetailEntity.DataBean info = (ItemDetailEntity.DataBean) entity;
            Row r = sheet.createRow(rowIndex++);
            int cellIndex = 0;

            r.createCell(cellIndex++).setCellValue(info.getTitle());
            r.createCell(cellIndex++).setCellValue(info.getCatName());
            String adStr = (info.getP4p() == 1 ? "直通车" : "") +
                    (info.getTaoke() == 1 ? "淘宝客" : "") +
                    (info.getSales() == 1 ? "站内活动" : "") +
                    (info.getJuhuasuan() == 1 ? "聚划算" : "") +
                    (info.getZuanzhan() == 1 ? "钻石展位" : "");
            r.createCell(cellIndex).setCellValue(adStr);
        }
    }

    <T> void shopDetailOutput(List<T> entities){
        int rowIndex = 1;
        SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
        for (T entity : entities) {
            ShopDetailEntity.DataBean.ListBean info = (ShopDetailEntity.DataBean.ListBean) entity;
            Row r = sheet.createRow(rowIndex++);
            int cellIndex = 0;

            r.createCell(cellIndex++).setCellValue(format.format(info.getDate()));
            r.createCell(cellIndex++).setCellValue(info.getAmount());
            r.createCell(cellIndex++).setCellValue(info.getPrice());
            r.createCell(cellIndex++).setCellValue(info.getHotItemCount());
            r.createCell(cellIndex++).setCellValue(info.getRatio());
            r.createCell(cellIndex++).setCellValue(info.getItemCount());
            r.createCell(cellIndex++).setCellValue(info.getNewItemCount());
            r.createCell(cellIndex++).setCellValue(info.getUpdateChange());
            r.createCell(cellIndex++).setCellValue(info.getPriceChange());
            r.createCell(cellIndex++).setCellValue(info.getTitleChange());
            r.createCell(cellIndex++).setCellValue(info.getSearch_itemcnt());
            r.createCell(cellIndex++).setCellValue(info.getSearch_keycnt());
            r.createCell(cellIndex++).setCellValue(info.getSpsearch_itemcnt());
            r.createCell(cellIndex++).setCellValue(info.getSpsearch_keycnt());
            r.createCell(cellIndex++).setCellValue(info.getMsearch_itemcnt());
            r.createCell(cellIndex++).setCellValue(info.getMsearch_keycnt());
            r.createCell(cellIndex++).setCellValue(info.getSpmsearch_itemcnt());
            r.createCell(cellIndex++).setCellValue(info.getSpmsearch_keycnt());
            r.createCell(cellIndex++).setCellValue(info.getP4p_keycnt());
            r.createCell(cellIndex++).setCellValue(info.getP4p_itemcnt());
            r.createCell(cellIndex++).setCellValue(info.getMp4p_keycnt());
            r.createCell(cellIndex++).setCellValue(info.getMp4p_itemcnt());
            r.createCell(cellIndex++).setCellValue(info.getZuanzhan());
            r.createCell(cellIndex++).setCellValue(info.getJuhuasuan());
            r.createCell(cellIndex).setCellValue(info.getTaoke());
        }
    }

    <T> void taobaokeOutput( List<T> entities){
        int rowIndex = 1;
        SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
        for ( T entity : entities) {
            TaoBaoKeEntity.DataBean.ListBean info = (TaoBaoKeEntity.DataBean.ListBean) entity;
            Row r = sheet.createRow(rowIndex++);
            int cellIndex = 0;

            r.createCell(cellIndex++).setCellValue(format.format(info.getDate()));
            r.createCell(cellIndex++).setCellValue(info.getTitle());
            r.createCell(cellIndex++).setCellValue(info.getDiscount());
            r.createCell(cellIndex++).setCellValue(info.getPrice());
            r.createCell(cellIndex++).setCellValue(info.getPayRate());
            r.createCell(cellIndex++).setCellValue(info.getPayPrice());
            r.createCell(cellIndex++).setCellValue(info.getAmount_());
            r.createCell(cellIndex++).setCellValue(info.getPrice_());
            r.createCell(cellIndex).setCellValue(info.getPayPrice30());
        }
    }

    <T> void renameOutput(List<T> entities){
        int rowIndex = 1;
        SimpleDateFormat format =  new SimpleDateFormat( " yyyy-MM-dd" );
        for (T entity : entities) {
            RenameEntity.DataBean.ListBean info = (RenameEntity.DataBean.ListBean) entity;
            Row r = sheet.createRow(rowIndex++);
            int cellIndex = 0;

            r.createCell(cellIndex++).setCellValue(info.getNewTitle());
            r.createCell(cellIndex++).setCellValue(info.getOldTitle());
            r.createCell(cellIndex).setCellValue(format.format(info.getChangeDate()));
        }
    }
}
