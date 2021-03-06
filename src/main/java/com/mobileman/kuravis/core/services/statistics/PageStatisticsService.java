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
 * StatisticsService.java
 * 
 * Project: Kuravis
 * 
 * @author MobileMan GmbH
 * @date 27.8.2013
 * @version 1.0
 * 
 * (c) 2013 MobileMan GmbH, www.mobileman.com
 */

package com.mobileman.kuravis.core.services.statistics;

import com.mongodb.DBObject;

/**
 * @author MobileMan GmbH
 *
 */
public interface PageStatisticsService {

	/**
	 * @param pageId
	 * @param parameter
	 * @return result data
	 */
	DBObject save(String pageId, String parameter);

	/**
	 * @param pageId
	 * @param parameter
	 * @return statistics
	 */
	DBObject computeStatistics(String pageId, String parameter);

}
