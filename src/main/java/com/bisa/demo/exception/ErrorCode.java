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
    CREATE_PERSON_REFERENCE_IS_REQUIRED("APPDEMO-0016"); 

    private String code;

    public String getCode() {
        return code;
    }

    public boolean isSuccessfull() {
        return code == SUCCESSFUL.getCode();
    }
}
