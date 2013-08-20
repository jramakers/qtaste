/*
    Copyright 2007-2012 QSpin - www.qspin.be

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

package com.qspin.qtaste.javagui;

import javax.swing.JOptionPane;

import com.qspin.qtaste.testsuite.QTasteException;
import com.qspin.qtaste.testsuite.QTasteTestFailException;

/**
 * This interface describe all the methods usable to perform actions or control on a Java GUI application.
 * This interface is called "MBean" as methods may be used remotely using JMX.
 * @author lvboque
 */
public interface JavaGUI {
  
   /**
    * Change the COMPONENT_ENABLED_TIMEOUT used when JavaGUI searches a fully active component. 
    * @param pTimeOut the new timeout value in seconds.
    * @throws IllegalArgumentException if the timeout value is negative.
    */
   void setComponentEnabledTimeout(int pTimeOut) throws IllegalArgumentException;
	
   /**
     * Create a snapshot of the specified GUI componentName and save it as the specified filename in the current working directory.
     * @param componentName an identifier of the GUI component.
     * @param fileName the name of the image file.
     */
   void takeSnapShot(String componentName, String fileName) throws QTasteTestFailException;
   
   /**
     * Get the list of all the component names.
	 * @return an array of String containing all the names of the component of the GUI application.
     */
   String [] listComponents() throws QTasteTestFailException;
      
   /**
     * Check if a specified component is enabled.
	 * @return <code>true</code> if the specified component is enabled.
     */
   boolean isEnabled(String componentName) throws QTasteTestFailException;
      
   /**
     * Click on the specified componentName.
     * @param componentName an identifier of the GUI component.     
	 * @return <code>true</code> if the action occurs correcly.
     */
   boolean clickOnButton(String componentName) throws QTasteTestFailException;

    /**
     * Click on the specified componentName during a specified period of time.
     * @param componentName an identifier of the GUI component.
	 * @param pressTime an identifier of the GUI component.     
	 * @return <code>true</code> if the action occurs correcly.
     */
   boolean clickOnButton(String componentName, int pressTime) throws QTasteTestFailException;
   
    /**
     * Get the text used for the specied component.
     * @param componentName an identifier of the GUI component.     
	 * @return Return the text of the specified componentName.
     */
   String getText(String componentName) throws QTasteTestFailException;
   
    /**
     * Set the text for the specied component.
     * @param componentName an identifier of the GUI component.
	 * @param value the new value for the text.
	 * @return <code>true</code> if the action occurs correcly.
     */
   boolean setText(String componentName, String value) throws QTasteTestFailException;
    
   
   /**
    * Select the specified tab for the tabbed pane.
    * @param tabbedPaneComponentName the tabbed pane component name
    * @param tabIndex the tab index (first at 0). 
    * @return <code>true</code> if the action occurs correcly.
    */
   boolean selectTab(String tabbedPaneComponentName, int tabIndex) throws QTasteTestFailException;
   
    /**
     * Select the specified componentName.
     * @param componentName an identifier of the GUI component.
	 * @param value the new value for the text.
	 * @return <code>true</code> if the action occurs correcly.
     */
   // TODO: Should it be selectComponent? what is the purpose of value? Please Document parameters, please specify the context? CheckBox?
   boolean selectComponent(String componentName, boolean value) throws QTasteTestFailException;
   
   // TODO: Should it be selectComponent? what is the purpose of value? Please Document parameters, please specify the context? CheckBox?   
   boolean selectValue(String componentName, String value) throws QTasteTestFailException;
   
   // TODO: Should it be selectComponent? what is the purpose of value? Please Document parameters
   boolean selectIndex(String componentName, int index) throws QTasteTestFailException;
   
   // TODO: Should it be selectComponent? what is the purpose of value? Please Document parameters
   boolean selectNode(String componentName, String nodeName, String nodeSeparator) throws QTasteTestFailException;
   
   // TODO: Should it be selectComponent? what is the purpose of value? Please Document parameters
   
   /**
    * Return the name of the GUI component that have the focus
    * @return the name of the component
    * @throws QTasteTestFailException
    */
   String whoAmI() throws QTasteTestFailException;
   
   /**
    * Set the name of the GUI component that have the focus with the specified name
    * @throws QTasteTestFailException 
    */
   void setComponentName(String name) throws QTasteTestFailException;
   
   /**
    * Send the specified key code to the application
    * @param keycode key code of the key sent to the application.
    * @throws QTasteTestFailException If some internal errors occurs.
    */
   void pressKey(int keycode) throws QTasteTestFailException;
   
   /**
    * Send the specified key code to the application
    * @param keycode key code of the key sent to the application.
    * @param delay delay for the button pressed in milliseconds.
    * @throws QTasteTestFailException If some internal errors occurs. 
    */
   void pressKey(int keycode, long delay) throws QTasteTestFailException;
   
   /**
    * Checks if a component with the name exist or not.
    * @param pComponentName The component's name.
    * @return <code>true</code> if the component exist.
    */
   boolean exist(String pComponentName);
   
   /**
    * Counts the number of components that have the enabled state.
    * @param isEnabled <code>false</code> if the disabled components have to be counted.
    * @return The number of components that have the enabled state.
    */
   int getEnabledComponentCount(boolean isEnabled);

   int countTableRows(String pComponentName, String pColumnName, String pColumnValue)throws QTasteException;
   void selectInTable(String pComponentName, String pColumnName, String pColumnValue)throws QTasteException;
   void selectInTable(String pComponentName, String pColumnName, String pColumnValue, int pOccurenceIndex)throws QTasteException;
   
   /**
    * Checks if there is at least one popup displayed.
    * @return <code>true</code> if there is at least one popup.
    */
   boolean isPopupDisplayed() throws QTasteException;
   
   /**
    * Retrieves the text (message) of the active popup. 
    * @return the text (message) of the active popup.
    */
   String getPopupText() throws QTasteException;
   /**
    * Retrieves all popup texts.
    * @return all popup texts.
    */
   String[] getAllPopupText() throws QTasteException;
   
   /**
    * inserts a value in the active popup field.
    * @param value the value to insert.
    * @see {@link JOptionPane#showInputDialog(Object)}
    */
   void setPopupValue(String value) throws QTasteException;
   
   /**
    * Clicks on the button with the text in the active popup.
    * @param buttonText the button text.
    */
   void clickOnPopupButton(String buttonText) throws QTasteException;
   
   /**
    * Searches the component identified by the name and returns the component's background color.
    * @param componentName the component's name.
    * @return the found component's background color with the RGB color format expressed in hexadecimal.
    */
   String getComponentBackgroundColor(String componentName) throws QTasteException;
   
   /**
    * Searches the component identified by the name and returns the component's foreground color.
    * @param componentName the component's name.
    * @return the found component's foreground color with the RGB color format expressed in hexadecimal.
    */
   String getComponentForegroundColor(String componentName) throws QTasteException;
}
