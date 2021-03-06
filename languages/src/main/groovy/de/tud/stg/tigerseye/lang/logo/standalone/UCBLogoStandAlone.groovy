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
package de.tud.stg.tigerseye.lang.logo.standalone;

import de.tud.stg.tigerseye.*;
import org.javalogo.*;
import java.awt.Color;

import de.tud.stg.tigerseye.lang.logo.ISimpleLogo; 
import de.tud.stg.tigerseye.lang.logo.SimpleLogo; 

/**
 * This class implements the logo toy language.
 */
public class UCBLogoStandAlone extends SimpleLogo implements IUCBLogoStandAlone {
	 
	public UCBLogoStandAlone() {
		super();
	}
	
	/* Literals */

	/* Operations */
	
	/* Abstraction Operators */
	void repeat(int _times, Closure choreography) {
    	choreography.delegate = bodyDelegate;
        _times.times {
            choreography.call();
        }
    }	
}