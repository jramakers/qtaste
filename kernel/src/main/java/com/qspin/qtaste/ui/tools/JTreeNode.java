/*
    Copyright 2007-2009 QSpin - www.qspin.be

    This file is part of QTaste framework.

    QTaste is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    QTaste is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with QTaste. If not, see <http://www.gnu.org/licenses/>.
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.qspin.qtaste.ui.tools;

import java.io.File;

/**
 *
 * @author vdubois
 */
public interface JTreeNode {
    

    public File getFile();

    public boolean isDir();

    public String toString();
    

    public Object[] getChildren();    
    public String getId();
    public boolean isShowTestData();
    public void setShowTestdata(boolean value);

}
