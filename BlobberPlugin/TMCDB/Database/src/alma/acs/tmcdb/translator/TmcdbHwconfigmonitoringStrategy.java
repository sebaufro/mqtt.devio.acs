/*******************************************************************************
 * ALMA - Atacama Large Millimeter Array
 * Copyright (c) AUI - Associated Universities Inc., 2011
 * (in the framework of the ALMA collaboration).
 * All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA
 *******************************************************************************/
package alma.acs.tmcdb.translator;

import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;

public class TmcdbHwconfigmonitoringStrategy extends AbstractReverseEngineeringStrategy {

	public TmcdbHwconfigmonitoringStrategy(ReverseEngineeringStrategy delegate) {
		super(delegate);

		// Cannot use reflexion to find classes in a package,
		// so I'll have to hardcode the classnames here.. :(
		columnTranslators = new AbstractColumn2Attribute[] {
				new Column2Attribute_SwCore(),
				new Column2Attribute_SwExt(),
				new Column2Attribute_HwConfigMonitoring()
		};
		tableTranslators = new AbstractTable2Class[] {
				new Table2Class_SwCore(),
				new Table2Class_SwExt(),
				new Table2Class_HwConfigMonitoring()
		};
		inheritanceTranslators = new AbstractTableInheritance[] {
				new TableInheritance_SwCore(),
				new TableInheritance_SwExt(),
				new TableInheritance_HwConfigMonitoring()
		};
	}

}
