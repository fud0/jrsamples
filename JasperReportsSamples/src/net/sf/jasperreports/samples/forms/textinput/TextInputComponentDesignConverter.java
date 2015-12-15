/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.samples.forms.textinput;

import net.sf.jasperreports.engine.JRComponentElement;
import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRPrintElement;
import net.sf.jasperreports.engine.component.ComponentDesignConverter;
import net.sf.jasperreports.engine.convert.ElementIconConverter;
import net.sf.jasperreports.engine.convert.ReportConverter;
import net.sf.jasperreports.engine.util.JRImageLoader;

/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public class TextInputComponentDesignConverter extends ElementIconConverter implements ComponentDesignConverter
{

	/**
	 *
	 */
	private final static TextInputComponentDesignConverter INSTANCE = new TextInputComponentDesignConverter();
	
	/**
	 *
	 */
	private TextInputComponentDesignConverter()
	{
		super(JRImageLoader.SUBREPORT_IMAGE_RESOURCE);//FIXMEINPUT
	}

	/**
	 *
	 */
	public static TextInputComponentDesignConverter getInstance()
	{
		return INSTANCE;
	}

	/**
	 *
	 */
	public JRPrintElement convert(ReportConverter reportConverter, JRComponentElement element)
	{
		return convert(reportConverter, (JRElement)element);
	}
}
