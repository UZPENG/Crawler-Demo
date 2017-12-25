package model.io;

import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.util.List;

/**
 * @author serverliu on 2017/12/25.
 */
public interface IWriteIntoExcel {
    <T> void writeIntoExcel(File file, String[] titles, List<T> data, int flag);
}
