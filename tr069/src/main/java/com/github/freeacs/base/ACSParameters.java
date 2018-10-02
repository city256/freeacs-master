package com.github.freeacs.base;

import com.github.freeacs.tr069.xml.ParameterValueStruct;

import java.util.HashMap;
import java.util.Map;
// ACS 매개변수 값  초기화,겟,putPVS,
// getACSParameters
public class ACSParameters {

	private Map<String, ParameterValueStruct> acsParams = new HashMap<String, ParameterValueStruct>();

	public String getValue(String param) {
		ParameterValueStruct pvs = acsParams.get(param);
		if (pvs != null && pvs.getValue() != null)		// pvs가 비었으면 null 아니면 getValue()
			return pvs.getValue();
		else
			return null;
	}


	public void putPvs(String param, ParameterValueStruct pvs) {
		acsParams.put(param, pvs);
	} // 파라미터 구조체에 파라미터 삽입

	public Map<String, ParameterValueStruct> getAcsParams() {
		return acsParams;
	}

}
