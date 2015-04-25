package com.jasper;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperDesignViewer;

public class JasperReportViewer {
	private String jrPath;
	private String reportTemplate;
	private Boolean isXML;
	
	private JasperDesignViewer jasperDesignViewer;

	public void setJrPath(String jrPath){
		this.jrPath = jrPath;
	}
	
	public String getJrPath(){
		return this.jrPath;
	}
	
	public void setReportTemplate(String reportTemplate){
		this.reportTemplate = reportTemplate;
	}
	
	public String getReportTemplate(){
		return this.reportTemplate;
	}

	public void setIsXML(Boolean isXML){
		this.isXML = isXML;
	}

	public JasperReportViewer(){
	}

	public JasperReportViewer(JasperDesignViewer jasperDesignViewer ){
		this.jasperDesignViewer = jasperDesignViewer;
	}

	@SuppressWarnings("static-access")
	public void viewReport(){
		System.out.println("Accessing viewReport() method with values jrPath "+this.jrPath+this.reportTemplate);
		try {
			jasperDesignViewer.viewReportDesign(this.jrPath+this.reportTemplate, this.isXML);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
