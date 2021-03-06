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
 * Roles.java
 * 
 * Projekt: 
 * 
 * @author MobileMan GmbH
 * @date 9.7.2013
 * @version 1.0
 * 
 * (c) 2013 MobileMan GmbH, www.mobileman.com
 */

package com.mobileman.kuravis.core.domain.user;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author MobileMan GmbH
 *
 */
public class Roles {

	/**
	 * 
	 */
	public static final String USER = "user";
	
	/**
	 * 
	 */
	public static final String ADMIN = "admin";
	
	/**
	 * 
	 */
	public static final String NONVERIFIED_USER = "nonverified_user";
	
	/**
	 * 
	 */
	public static final List<String> ALL_ROLES = Collections.unmodifiableList(Arrays.asList(USER, ADMIN, NONVERIFIED_USER));
}
