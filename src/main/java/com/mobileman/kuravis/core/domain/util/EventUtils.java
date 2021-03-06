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
package com.mobileman.kuravis.core.domain.util;

import java.util.Date;

import com.mobileman.kuravis.core.domain.event.Event;
import com.mobileman.kuravis.core.domain.event.EventType;
import com.mongodb.DBObject;

public abstract class EventUtils {

	public static void setBaseProperties(Event event) {
		EntityUtils.setBaseProperties(event);
		if (event.getStart() == null) {
			event.setStart(new Date());
		}
		// if (event.getEnd() == null) {
		// event.setEnd(event.getStart());
		// }
	}

	public static EventType getEventType(DBObject event) {
		try {
			return EventType.fromJson((String) event.get(Event.EVENT_TYPE));
		} catch (Exception e) {
			return null;
		}
	}

}
