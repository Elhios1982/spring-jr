package com.jasper;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperDesignViewer;

public class JasperReportViewer {
	private String jrPath;
	private Boolean isXML;
	private JasperDesignViewer jasperDesignViewer;

	public void setJrPath(String jrPath){
		this.jrPath = jrPath;
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
		System.out.println("Accessing viewReport() method with values jrPath "+this.jrPath);
		try {
			jasperDesignViewer.viewReportDesign(this.jrPath, this.isXML);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//jasperDesignViewer.viewReportDesign(this.jrPath);
	}

}
