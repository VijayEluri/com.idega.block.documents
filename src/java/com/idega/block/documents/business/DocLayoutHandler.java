/*
 * $Id: DocLayoutHandler.java,v 1.6 2007/10/08 05:22:29 civilis Exp $
 *
 * Copyright (C) 2001 Idega hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 *
 */
package com.idega.block.documents.business;

import java.util.List;

import com.idega.block.documents.presentation.Doc;
import com.idega.core.builder.presentation.ICPropertyHandler;
import com.idega.presentation.IWContext;
import com.idega.presentation.PresentationObject;
import com.idega.presentation.ui.DropdownMenu;

/**
 * @author <a href="tryggvi@idega.is">Tryggvi Larusson</a>
 * @version 1.0
 */
public class DocLayoutHandler implements ICPropertyHandler {
  /**
   *
   */
  public DocLayoutHandler() {
  }

  /**
   *
   */
  public List getDefaultHandlerTypes() {
    return(null);
  }

  /**
   *
   */
  public PresentationObject getHandlerObject(String name, String value, IWContext iwc) {
    DropdownMenu menu = new DropdownMenu(name);
    menu.addMenuElement("","Select:");
    menu.addMenuElement(Doc.BOX_VIEW,"Doc view");
    menu.addMenuElement(Doc.CATEGORY_VIEW,"Category view");
    menu.addMenuElement(Doc.COLLECTION_VIEW,"Collection view");
    menu.setSelectedElement(value);
    return(menu);
  }

  /**
   *
   */
  public void onUpdate(String values[], IWContext iwc) {
  }
  
  public PresentationObject getHandlerObject(String name, String stringValue, IWContext iwc, boolean oldGenerationHandler, String instanceId, String method) {
	  return null;
  }
}
