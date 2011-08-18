/**
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on 07/09/2005
 */
package com.python.pydev.analysis.additionalinfo;



public class ClassInfo extends AbstractInfo{

    /**
     * Changed for 2.1
     */
    private static final long serialVersionUID = 3L;


    public ClassInfo(String className, String moduleDeclared, String path) {
        super(className, moduleDeclared, path);
    }
    
    public ClassInfo(String className, String moduleDeclared, String path, boolean doNotInternOnThisContstruct) {
        super(className, moduleDeclared, path, doNotInternOnThisContstruct);
    }

    
    public int getType() {
        return CLASS_WITH_IMPORT_TYPE;
    }
}