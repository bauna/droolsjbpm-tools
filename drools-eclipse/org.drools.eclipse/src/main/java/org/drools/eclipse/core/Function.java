/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.eclipse.core;

/**
 * This represents a function. 
 */
public class Function extends DroolsElement {

    private final String functionName;

    Function(Package parent, String functionName) {
        super(parent);
        this.functionName = functionName;
    }
    
    public Package getParentPackage() {
        return (Package) getParent();
    }

    public String getFunctionName() {
        return functionName;
    }

    public int getType() {
        return FUNCTION;
    }

    public DroolsElement[] getChildren() {
        return NO_ELEMENTS;
    }

    public String toString() {
        return functionName;
    }

}
