/* 
 * This file is part of the Echo Extras Project.
 * Copyright (C) 2005-2007 NextApp, Inc.
 *
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 */

package nextapp.echo.extras.app.serial.property;

import org.w3c.dom.Element;

import nextapp.echo.app.serial.SerialException;
import nextapp.echo.app.serial.SerialPropertyPeer;
import nextapp.echo.app.util.Context;

/**
 * <code>SerialPropertyPeer</code> for <code>MenuStateModel</code> properties.
 * 
 * @author n.beekman
 */
public class MenuStateModelPeer implements SerialPropertyPeer {

    /**
     * @see SerialPropertyPeer#toProperty(Context, Class, Element)
     */
    public Object toProperty(Context context, Class objectClass, Element propertyElement) throws SerialException {
        throw new UnsupportedOperationException();
    }
    
    /**
     * @see SerialPropertyPeer#toXml(Context, Class, Element, Object)
     */
    public void toXml(Context context, Class objectClass, Element propertyElement, Object propertyValue) throws SerialException {
        propertyElement.setAttribute("t", SerialPropertyPeerConstants.PROPERTY_TYPE_PREFIX + "MenuStateModel");
        // FIXME need a way to access menu id's
    }
}