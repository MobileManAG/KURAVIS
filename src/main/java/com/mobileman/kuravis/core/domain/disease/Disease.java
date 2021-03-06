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
package com.mobileman.kuravis.core.domain.disease;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mobileman.kuravis.core.domain.NamedEntity;

/**
 * @author MobileMan GmbH
 * 
 */
@JsonSerialize(include=Inclusion.NON_NULL)
@Document(collection = DiseaseAttributes.ENTITY_NAME)
public class Disease extends NamedEntity implements DiseaseAttributes {
	
	@Indexed(unique = false)
	private Integer treatmentReviewsCount;
	
	/**
	 * 
	 */
	public Disease() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 */
	public Disease(String id, String name) {
		super(id, name);
	}

	/**
	 *
	 * @return treatmentReviewsCount
	 */
	public Integer getTreatmentReviewsCount() {
		return this.treatmentReviewsCount;
	}

	/**
	 *
	 * @param treatmentReviewsCount treatmentReviewsCount
	 */
	public void setTreatmentReviewsCount(Integer treatmentReviewsCount) {
		this.treatmentReviewsCount = treatmentReviewsCount;
	}

	
}
