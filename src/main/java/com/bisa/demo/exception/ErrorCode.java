/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.demo.exception;

import lombok.AllArgsConstructor;

/**
 *
 * @author alepaco.com
 */
@AllArgsConstructor
public enum ErrorCode {

    SUCCESSFUL("APPDEMO-0000"),
    ERROR_PROCESSING_THE_TRANSACTION("APPDEMO-0001"),  
    CREATE_PERSON_NAME_IS_REQUIRED("APPDEMO-0002"),  
    CREATE_PERSON_NAME_IS_INVALID("APPDEMO-0003"),  
    CREATE_PERSON_PATERNAL_LAST_NAME_IS_REQUIRED("APPDEMO-0004"),  
    CREATE_PERSON_PATERNAL_LAST_NAME_IS_INVALID("APPDEMO-0005"),  
    CREATE_PERSON_MATERNAL_LAST_NAME_IS_REQUIRED("APPDEMO-0006"),  
    CREATE_PERSON_MATERNAL_LAST_NAME_IS_INVALID("APPDEMO-0007"),  
    CREATE_PERSON_DATE_OF_BIRTH_IS_REQUIRED("APPDEMO-0008"),  
    CREATE_PERSON_DATE_OF_BIRTH_IS_INVALID("APPDEMO-0009"),  
    CREATE_PERSON_IDENTITY_CARD_IS_REQUIRED("APPDEMO-0010"),  
    CREATE_PERSON_IDENTITY_CARD_IS_INVALID("APPDEMO-0011"),  
    CREATE_PERSON_ADDRESS_IS_REQUIRED("APPDEMO-0012"),  
    CREATE_PERSON_GEOGRAPHIC_LOCATION_IS_REQUIRED("APPDEMO-0013"),  
    CREATE_PERSON_AREA_NEIGHBORHOOD_STREET_IS_REQUIRED("APPDEMO-0014"),  
    CREATE_PERSON_ADDRESS_NUMBER_IS_REQUIRED("APPDEMO-0015"),  
    CREATE_PERSON_REFERENCE_IS_REQUIRED("APPDEMO-0016"), 
    CREATE_CLIENT_PERSON_IS_REQUIRED("APPDEMO-0017"), 
    CREATE_CLIENT_PERSON_IS_INVALID("APPDEMO-0018"), 
    CREATE_CLIENT_PERSON_LESS_THAN_20_YEARS_OLD("APPDEMO-0019"),
    CREATE_CLIENT_TELEPHONE_IS_REQUIRED("APPDEMO-0020"),
    CREATE_CLIENT_OCCUPATION_IS_REQUIRED("APPDEMO-0021"),
    CREATE_CLIENT_EMAIL_IS_REQUIRED("APPDEMO-0022"),
    ADD_PERSONAL_REFERENCE_TO_CLIENT_CLIENT_ID_IS_REQUIRED("APPDEMO-0023"), 
    ADD_PERSONAL_REFERENCE_TO_CLIENT_CLIENT_ID_IS_INVALID("APPDEMO-0024"), 
    ADD_PERSONAL_REFERENCE_TO_CLIENT_PERSON_ID_IS_REQUIRED("APPDEMO-0025"), 
    ADD_PERSONAL_REFERENCE_TO_CLIENT_PERSON_ID_IS_INVALID("APPDEMO-0026"),
    ADD_PERSONAL_REFERENCE_TO_CLIENT_EXISTING_REFERENCE("APPDEMO-0027"),
    REMOVE_PERSONAL_REFERENCE_TO_CLIENT_REFERENCE_ID_IS_REQUIRED("APPDEMO-0028"),
    REMOVE_PERSONAL_REFERENCE_TO_CLIENT_REFERENCE_ID_IS_INVALID("APPDEMO-0029"),
    REMOVE_PERSONAL_REFERENCE_TO_CLIENT_REASON_FOR_ELIMINATION_IS_REQUIRED("APPDEMO-0030"),
    REMOVE_PERSONAL_REFERENCE_TO_CLIENT_REFERENCE_IS_ALREADY_REMOVED("APPDEMO-0031"), 
    CREATE_CLIENT_PERSON_IS_ASSOCIATED_WITH_ANOTHER_CUSTOMER("APPDEMO-0032"), 
    LIST_CLIENTS_BY_ACCESSIBILITY_FILTER_ACCESSIBILITY_IS_REQUIRED("APPDEMO-0033"),
    LIST_CLIENTS_BY_ACCESSIBILITY_FILTER_ACCESSIBILITY_IS_INVALID("APPDEMO-0034"), 
    ADD_PERSONAL_REFERENCE_TO_CLIENT_CLIENT_ID_IS_INVALID_BY_THEY_ARE_THE_SAME_PERSON("APPDEMO-0035"); 
    

    private String code;

    public String getCode() {
        return code;
    }

    public boolean isSuccessfull() {
        return code == SUCCESSFUL.getCode();
    }
    
}
