package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Location;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;


public class LocationPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document document,
			PdfWriter arg2, HttpServletRequest arg3, HttpServletResponse arg4)
			throws Exception {
		
		//1.read data from map
		List<Location> locList=(List<Location>)map.get("locListObj");
		
		//2.construct data as table
		PdfPTable table=new PdfPTable(3);
		
		//3.add header
		table.addCell("Location Id");
		table.addCell("Location Name");
		table.addCell("Location Type");
		//4.add data
		for(Location loc:locList){
			table.addCell(Integer.toString(loc.getLocId()));
			table.addCell(loc.getLocName());
			table.addCell(loc.getLocType());
		}
		
		//5.add elements to Document
		Paragraph p=new Paragraph("welcome to PDF File.....");
		document.add(p);
		document.add(table);
		
	}
}
