package com.javaee.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 
 * @author Diogo Giomo
 * @since 11/05/2018
 * 
 *        Arquivo customtag.tld (WEB-INF e web.xml)
 */
public class CustomTag extends SimpleTagSupport {

	public CustomTag() {
	}

	private String text = "";
	private boolean visible = true;
	private String fontColor = "black";
	private String fontSize = "12";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String getFontColor() {
		return fontColor;
	}

	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}

	public String getFontSize() {
		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}

	@Override
	public void doTag() throws JspException, IOException {
		StringBuilder sb = new StringBuilder();
		if (isVisible()) {
			sb.append("<label style='").append("color:").append(getFontColor()).append(";font-size:")
					.append(getFontSize()).append("'>").append(text).append("</label>");
		}
		getJspContext().getOut().write(sb.toString());
	}
}
