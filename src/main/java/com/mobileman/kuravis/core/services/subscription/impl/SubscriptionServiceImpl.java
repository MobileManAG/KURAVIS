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
 * SubscriptionServiceImpl.java
 * 
 * Project: Kuravis
 * 
 * @author MobileMan GmbH
 * @date 8.11.2013
 * @version 1.0
 * 
 * (c) 2013 MobileMan GmbH, www.mobileman.com
 */

package com.mobileman.kuravis.core.services.subscription.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.mobileman.kuravis.core.domain.util.EntityUtils;
import com.mobileman.kuravis.core.exception.ErrorCodes;
import com.mobileman.kuravis.core.services.entity.impl.AbstractEntityServiceImpl;
import com.mobileman.kuravis.core.services.messaging.mail.MailService;
import com.mobileman.kuravis.core.services.subscription.SubscriptionService;
import com.mobileman.kuravis.core.util.ErrorUtils;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 * @author MobileMan GmbH
 *
 */
@Service
public class SubscriptionServiceImpl extends AbstractEntityServiceImpl implements SubscriptionService {
	
	@Autowired
	private MailService mailService;

	/** 
	 * {@inheritDoc}
	 * @see com.mobileman.kuravis.core.services.entity.impl.AbstractEntityServiceImpl#getEntityName()
	 */
	@Override
	protected String getEntityName() {
		return EntityUtils.SUBSCRIPTION;
	}

	/** 
	 * {@inheritDoc}
	 * @see com.mobileman.kuravis.core.services.subscription.SubscriptionService#subscribe(com.mongodb.BasicDBObject)
	 */
	@Override
	public void subscribe(BasicDBObject subscription) {
		if (StringUtils.isEmpty(subscription.get("email"))) {
			throw ErrorUtils.exception("Email is missing", ErrorCodes.INCORRECT_PARAMETER);
		}
		
		DBObject existing = findOneByProperty(EntityUtils.SUBSCRIPTION, "email", subscription.get("email"));
		if (existing != null) {
			// update modified-on property
			super.update(existing);
		} else {
			super.save(subscription);
		}
		
		mailService.sendUserSubscribedEmail(subscription);
	}

}
