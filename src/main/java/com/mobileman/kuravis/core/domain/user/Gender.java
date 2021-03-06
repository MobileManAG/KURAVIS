/*******************************************************************************
 * Copyright 2015 MobileMan GmbH
 * www.mobileman.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 * Gender.java
 * 
 * Projekt: KURAVA
 * 
 * @author MobileMan GmbH
 * @date 11.7.2013
 * @version 1.0
 * 
 * (c) 2013 MobileMan GmbH, www.mobileman.com
 */

package com.mobileman.kuravis.core.domain.user;

/**
 * @author MobileMan GmbH
 *
 */
public enum Gender {

	/**
	 * 
	 */
	MALE("male"),
	
	/**
	 * 
	 */
	FEMALE("female"),
	
	/**
	 * 
	 */
	UNKNOWN("unknown");
	
	private final String value;
	
	Gender(String val) {
		this.value = val;
	}
	
	/**
	 * @return value
	 */
	public String getValue() {
		return this.value;
	}
}
