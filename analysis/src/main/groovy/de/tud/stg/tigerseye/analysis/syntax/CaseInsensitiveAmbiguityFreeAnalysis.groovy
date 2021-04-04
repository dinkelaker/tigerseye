///////////////////////////////////////////////////////////////////////////////
// Copyright 2009-2015, Technische Universitaet Darmstadt (TUD), Germany
//
// The TUD licenses this file to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
///////////////////////////////////////////////////////////////////////////////
package de.tud.stg.tigerseye.analysis.syntax;

import groovy.lang.MetaProperty;
import java.util.List;

import de.tud.stg.tigerseye.Interpreter;

/**
 * This is an abstract interpreter that can be used to determine if all case insensitive keywords a DSL program uses
 * can be correctly interpreted with the referenced interpreter.
 * @author Tom Dinkelaker
 */


public class CaseInsensitiveAmbiguityFreeAnalysis extends UsedKeywordsAnalysis {
//public class CaseInsensitiveAmbiguityFreeAnalysis {

	Interpreter interpreter;
	Set<String> ambiguities;
	
	public CaseInsensitiveAmbiguityFreeAnalysis(Interpreter interpreter) {
		super();
		this.interpreter = interpreter;
	}
	
	private final boolean DEBUG = true;
	
    public boolean isNonAmbiguous() {
    	return isNonAmbiguousWRTLiterals() && isNonAmbiguousWRTOperations() && 
    	  isNonAmbiguousWRTAbstractions;
    }

    private boolean isNonAmbiguousWRTLiterals() {
	    List<MetaProperty> properties = interpreter.metaClass.getProperties();

		Set<String> foundLiterals = [];

		boolean foundAmbiguity = false;

	    properties.each { String literalKeyword ->
    	    if (!foundLiterals.contains(literalKeyword)) {
				foundLiterals << literalKeyword;
				println "literal unique: $literalKeyword"
			} else {
				ambiguities << literalKeyword;
				foundAmbiguity = true;
				println "literal ambique: $literalKeyword"
			}
    	}

		return foundAmbiguity;
    }

    private boolean isNonAmbiguousWRTOperations() {
	    List<MetaProperty> properties = interpreter.metaClass.getMethods();

		Set<String> foundLiterals = [];

		boolean foundAmbiguity = false;

	    properties.each { String literalKeyword ->
    	    if (!foundLiterals.contains(literalKeyword)) {
				foundLiterals << literalKeyword;
				println "literal unique: $literalKeyword"
			} else {
				ambiguities << literalKeyword;
				foundAmbiguity = true;
				println "literal ambique: $literalKeyword"
			}
    	}
		
		return foundAmbiguity;
    }
    
    private boolean isNonAmbiguousWRTAbstractions() {
	    return isNonAmbiguousWRTOperations();
	}
}
