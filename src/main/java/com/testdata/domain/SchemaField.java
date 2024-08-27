package com.testdata.domain;

import com.testdata.domain.constant.MockDataType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SchemaField {

	private String fieldName;
	private MockDataType mockDataType;
	private Integer fieldOrder;
	private Integer blankPercent;
	private String typeOptionJson;
	private String forceValue;

}
