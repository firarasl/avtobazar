package az.autobazar.view;

import az.autobazar.domain.Auto;
import org.apache.poi.ss.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class AutoListExcelView extends AbstractXlsView {

    @Override
    protected void buildExcelDocument(Map<String, Object> model,
                                      Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        List<Auto> autoList = (List<Auto>) model.get("autoList");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        String filename = String.format("auto-list-%s.xls", formatter.format(now));
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

        Sheet sheet = workbook.createSheet("auto list");
        Row headerRow = sheet.createRow(0);

        headerRow.setHeightInPoints(24);
        CellStyle headerStyle = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setFontName("Arial");
        font.setBold(true);
        font.setFontHeightInPoints((short) 20);
        headerStyle.setFont(font);
        sheet.setDefaultColumnWidth(30);
        headerRow.setRowStyle(headerStyle);

        // id, brand, model, year, price, currency
        Cell idCell = headerRow.createCell(0, CellType.STRING);
        idCell.setCellValue("AUTO ID");
        idCell.setCellStyle(headerStyle);

        Cell brandCell = headerRow.createCell(1, CellType.STRING);
        brandCell.setCellValue("Brand");
        brandCell.setCellStyle(headerStyle);
        
        Cell modelCell = headerRow.createCell(2, CellType.STRING);
        modelCell.setCellValue("Model");
        modelCell.setCellStyle(headerStyle);
        
        Cell yearCell = headerRow.createCell(3, CellType.STRING);
        yearCell.setCellValue("Year");
        yearCell.setCellStyle(headerStyle);
        
        Cell priceCell = headerRow.createCell(4, CellType.STRING);
        priceCell.setCellValue("Price");
        priceCell.setCellStyle(headerStyle);
        
        Cell currencyCell = headerRow.createCell(5, CellType.STRING);
        currencyCell.setCellValue("Currency");
        currencyCell.setCellStyle(headerStyle);

        for (int i = 0; i < autoList.size(); i++) {
            Row row = sheet.createRow(i + 1);
            Auto auto = autoList.get(i);
            row.createCell(0, CellType.NUMERIC).setCellValue(auto.getId());
            row.createCell(1, CellType.STRING).setCellValue(auto.getModel().getBrand().getName());
            row.createCell(2, CellType.STRING).setCellValue(auto.getModel().getName());
            row.createCell(3, CellType.NUMERIC).setCellValue(auto.getYear());
            row.createCell(4, CellType.NUMERIC).setCellValue(auto.getPrice().doubleValue());
            // todo currency from sql
            row.createCell(5, CellType.STRING).setCellValue("AZN");
        }
    }
}
